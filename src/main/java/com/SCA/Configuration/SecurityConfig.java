package com.SCA.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.server.MatcherSecurityWebFilterChain;

import com.SCA.Service.CustomerUserDetailsService;

@Configuration
public class SecurityConfig {
	
	@Autowired
	private CustomerUserDetailsService userDetailsService;
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
		
	}
	
	@Bean
	public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception{
		
		return http.getSharedObject(AuthenticationManagerBuilder.class)
				.userDetailsService(userDetailsService)
				.passwordEncoder(passwordEncoder())
				.and()
				.build();
	// authenticate the user above	
	}
	
	@Bean  // as per the role forward the user  to the right panel
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		
		http.csrf().disable()
	    .authorizeHttpRequests()
	    .requestMatchers("/welcome").permitAll()
	    .anyRequest().authenticated()
	    .and()
	    .formLogin()
	    .loginPage("/gotologin")
	    .loginProcessingUrl("/login")
	    .successHandler(customerAuthenticationSuccessHandler())
	    .permitAll()
	    .and()
	    .logout()
	    .logoutUrl("/logout")
	    .logoutSuccessUrl("/welcome")
	    .permitAll();
		
		return http.build();
		
		
	}
	
	@Bean
	public AuthenticationSuccessHandler customerAuthenticationSuccessHandler() {
		
		return (request, response, authentication) -> {
			
		String role = authentication.getAuthorities().stream()
			.map(auth -> auth.getAuthority())
			.findFirst()
			.orElse("");
			
		if("ROLE_ADMIN".equals(role)) {
			response.sendRedirect("/adminpanel");
		}else {
			response.sendRedirect("/userpanel");
		}
			
			
			
		};
	}
	

}
