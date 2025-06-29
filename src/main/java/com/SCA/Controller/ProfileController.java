package com.SCA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SCA.Entities.HomeAppliancesWishlist;
import com.SCA.Entities.LaptopWishlist;
import com.SCA.Entities.OrderedProducts;
import com.SCA.Entities.PhoneWishlist;
import com.SCA.Entities.Profile;
import com.SCA.Entities.WishList;
import com.SCA.Entities.YourOrders;
import com.SCA.Service.HomeApplianceWishlistService;
import com.SCA.Service.LaptopWishlistService;
import com.SCA.Service.OrderedProductsService;
import com.SCA.Service.PhoneWishlistService;
import com.SCA.Service.ProfileService;
import com.SCA.Service.WishListService;
import com.SCA.Service.YourOrdersService;

@Controller
public class ProfileController {
	
	@Autowired
	private ProfileService serv;
	
	@Autowired
	private WishListService wserv;
	
	@Autowired
	private LaptopWishlistService lwserv;
	
	
	
	@Autowired
	private PhoneWishlistService pwserv;
	
	@Autowired
	private HomeApplianceWishlistService hawserv;
	
	@Autowired
	private OrderedProductsService oserv;
	
	@Autowired
	private YourOrdersService yserv;
	
	@RequestMapping("/gotologin")
	public String forwardToLogin() {
		return "login";
	}
	
	@RequestMapping("/gotoform")
	public String form() {
		
		return "userform";
	}

	@PostMapping("/info")
	@ResponseBody
	public String getInfo(@ModelAttribute Profile p) {
		
		Profile p1 = serv.insertData(p);
		System.out.println(p1);
		return "Your Data is Stored Successfully";
   }
	
	@RequestMapping("/adminpanel")
	public String gotoadmin() {
		return "adminpanel";
	}
	
	@RequestMapping("/visitprofile")
	public String gotoProfile() {
		return "profile";
	}
	
	@RequestMapping("/visitwishlist")
	public String gotoWishlist(Model model) {
		
	List<WishList> l1 = wserv.getAllData();
	model.addAttribute("list",l1);
	
	List<LaptopWishlist> l2 = lwserv.getAllData();
	model.addAttribute("list1",l2);
	
	
	
	List<PhoneWishlist> l4 = pwserv.getAllData();
	model.addAttribute("list3",l4);
	
	List<HomeAppliancesWishlist> l5 = hawserv.getAllData();
	model.addAttribute("list4",l5);
		
		return "wishlists";
		
	}
	
	@RequestMapping("/visitorderedproducts")
	public String gotoYourOrders(Model model) {
     List<YourOrders>  l1= yserv.getAllData();
     model.addAttribute("list",l1);
		return "yourorders";
	}
	
	
	
	
}
