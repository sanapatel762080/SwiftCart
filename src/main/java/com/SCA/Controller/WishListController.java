package com.SCA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.HomeAppliances;
import com.SCA.Entities.HomeAppliancesWishlist;
import com.SCA.Entities.Laptop;
import com.SCA.Entities.LaptopWishlist;
import com.SCA.Entities.Phones;
import com.SCA.Entities.Television;
import com.SCA.Entities.WishList;
import com.SCA.Service.HeadSetService;
import com.SCA.Service.HomeApplianceWishlistService;
import com.SCA.Service.HomeAppliancesService;
import com.SCA.Service.LaptopService;
import com.SCA.Service.LaptopWishlistService;
import com.SCA.Service.PhonesService;
import com.SCA.Service.TelevisionService;
import com.SCA.Service.WishListService;

@Controller
public class WishListController {
	
	@Autowired
	private WishListService serv;
	
	@Autowired
	private HeadSetService hserv;
	

	
	@Autowired
	private TelevisionService tserv;
	
	@Autowired
	private PhonesService pserv;
	
	
	@Autowired
	private LaptopWishlistService lwserv;
	
	@Autowired
	private LaptopService lserv;
	
	@Autowired
	private HomeApplianceWishlistService hwserv;
	
	@Autowired
	private HomeAppliancesService haserv;
	

	// HEADSET
	@RequestMapping("/wishlist/{id}")
	public String addtoWishList(@PathVariable("id") int id, Model model) {
     
	Optional<HeadSet> data = hserv.getSingledata(id);
	
    HeadSet h1 = data.get();
    
    WishList w = new WishList();
    w.setHname(h1.getHname());
    w.setHprice(h1.getHprice());
    w.setDescr(h1.getDescr());
    w.setHdiscount(h1.getHdiscount());
    
	
	serv.insert(w);
	
	List<WishList> l1 = serv.getAllData();
	model.addAttribute("list",l1);
	
	
		
	return "wishlists";
	}
	
	@RequestMapping("/remove/{hid}")
	public String removeData(@PathVariable("hid") int id, Model model) {
		
		serv.delete(id);
		
		List<WishList> l1 = serv.getAllData();
		model.addAttribute("list",l1);
		return "wishlists";
	}
	

	// TV
	
	@RequestMapping("/wishlisttv/{id}")
	public String addtoWishListTV(@PathVariable("id") int id, Model model) {
     
	Optional<Television> data = tserv.getSingledata(id);
	
	
    Television h1 = data.get();
    
    WishList w = new WishList();
    w.setHname(h1.getHname());
    w.setHprice(h1.getHprice());
    w.setDescr(h1.getDescr());
    w.setHdiscount(h1.getHdiscount());
    
	
	serv.insert(w);
	
	List<WishList> l1 = serv.getAllData();
	model.addAttribute("tv",l1);
	
	
		
	return "wishlists";
	}
	
	@RequestMapping("/removetv/{hid}")
	public String removeDatatv(@PathVariable("hid") int id, Model model) {
		
		serv.delete(id);
		
		List<WishList> l1 = serv.getAllData();
		model.addAttribute("list",l1);
		return "wishlists";
	}
	
	// Mobile Phones
	
	@RequestMapping("/phonewishlist/{id}")
    public String addToWishlist2(@PathVariable("id") int id, Model model) {
		Optional<Phones> data = pserv.getSingledata(id);
		
		
		
	    Phones h1 = data.get();
	    
	    WishList w = new WishList();
	    w.setHname(h1.getHname());
	    w.setHprice(h1.getHprice());
	    w.setDescr(h1.getDescr());
	    w.setHdiscount(h1.getHdiscount());
		
		serv.insert(w);
		
		List<WishList> l1 = serv.getAllData();
		model.addAttribute("phone",l1);
		
		
			
		return "wishlists";	
		
	}
	
	@RequestMapping("/removephone/{pid}")
	public String removeData2(@PathVariable("pid") int id, Model model) {
      serv.delete(id);
		
		List<WishList> l1 = serv.getAllData();
		model.addAttribute("list",l1);
		return "wishlists";
	
	}
	
	// LAPTOP
	
	@RequestMapping("/laptopwishlist/{id}")
    public String addToWishlist3(@PathVariable("id") int id, Model model) {
     Optional<Laptop> data = lserv.getSingledata(id);
		
	    Laptop l = data.get();
	    
	    LaptopWishlist w = new LaptopWishlist();
	    
	    w.setLname(l.getLname());
	    w.setLprice(l.getLprice());
	    w.setLdiscount(l.getLdiscount());
	    w.setLdescr(l.getLdescr());
		
		lwserv.insert(w);
		
		List<LaptopWishlist> l1 = lwserv.getAllData();
		model.addAttribute("li2",l1);
		
				
		return "laptopwishlists";
		}
	
	@RequestMapping("/removelaptop/{pid}")
	public String removeLaptopData(@PathVariable("pid") int id, Model model) {
		
		lwserv.deleteById(id);
		
		
		List<LaptopWishlist> l1 = lwserv.getAllData();
		model.addAttribute("li2",l1);
		
				
		return "laptopwishlists";

	}
	
	// Home Appliances
	
	@RequestMapping("/homeappliancewishlist/{id}")
    public String addToWishlisthomeappliance(@PathVariable("id") int id, Model model) {
     Optional<HomeAppliances> data = haserv.getSingledata(id);
		
	    HomeAppliances ha = data.get();
	    
	    HomeAppliancesWishlist w = new HomeAppliancesWishlist();
	    
	    w.setHname(ha.getHaname());
	    w.setHprice(ha.getHaprice());
	    w.setHdiscount(ha.getHadiscount());
	    w.setHdescr(ha.getHadescr());
		
		hwserv.insert(w);
		
		List<HomeAppliancesWishlist> l1 = hwserv.getAllData();
		model.addAttribute("li3",l1);
		
				
		return "homeappliancewishlists";
		}
	
	@RequestMapping("/removehomeappliance/{hid}")
	public String removeHomeAppliance(@PathVariable("hid") int id, Model model) {
		
		hwserv.deleteById(id);
		
		
		List<HomeAppliancesWishlist> l1 = hwserv.getAllData();
		model.addAttribute("li3",l1);
		
				
		return "homeappliancewishlists";

	}
	
	
	
	
		
	
	}
	
	

