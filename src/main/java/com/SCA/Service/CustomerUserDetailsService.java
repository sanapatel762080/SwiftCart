package com.SCA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.SCA.Entities.Profile;
import com.SCA.Repository.ProfileRepository;

@Service
public class CustomerUserDetailsService implements UserDetailsService{

	@Autowired
	private ProfileRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Profile p = repo.findbyemail(email);
		List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("ROLE_"+p.getRole()));
		
		
		return new User(p.getEmail(),p.getPassword(),authorities);
	}

}
