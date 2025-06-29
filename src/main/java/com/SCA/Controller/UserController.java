package com.SCA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/userpanel")
	public String userDashBoard() {
		
		return "userpanel";
	}
	
	@RequestMapping("/home")
	public String gotoHome() {
		return "userpanel";
	}
	
	@RequestMapping("/about")
	public String gotoAboutUs() {
		return "aboutus";
	}
	
	@RequestMapping("/wishlist")
	public String gotoWishlist() {
		return "wishlists";
	}
	
	
}
