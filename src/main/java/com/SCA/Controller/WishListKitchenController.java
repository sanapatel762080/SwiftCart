package com.SCA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SCA.Entities.Cleaning;
import com.SCA.Entities.Dining;
import com.SCA.Entities.Furniture;
import com.SCA.Entities.MensFashion;
import com.SCA.Entities.WishList;
import com.SCA.Service.CleaningService;
import com.SCA.Service.DiningService;
import com.SCA.Service.FurnitureService;
import com.SCA.Service.WishListService;

@Controller
public class WishListKitchenController {
	@Autowired
	private WishListService serv;
	
	@Autowired
	private FurnitureService fserv;
	
	@Autowired
	private DiningService dserv;
	
	@Autowired
	private CleaningService cserv;
	
	// Furniture
	
	@RequestMapping("/wishlistfurniture/{id}")
	public String addtoWishList1(@PathVariable("id") int id, Model model) {
     
	Optional<Furniture> data = fserv.getSingledata(id);
	
    Furniture h1 = data.get();
    
    WishList w = new WishList();
    w.setHname(h1.getHname());
    w.setHprice(h1.getHprice());
    w.setDescr(h1.getDescr());
    w.setHdiscount(h1.getHdiscount());
    
	
	serv.insert(w);
	
	List<WishList> l1 = serv.getAllData();
	model.addAttribute("furni",l1);
	
	
		
	return "wishlists";
	}
	
	// Dining
	
	@RequestMapping("/wishlistdining/{id}")
	public String addtoWishList2(@PathVariable("id") int id, Model model) {
     
	Optional<Dining> data = dserv.getSingledata(id);
	
    Dining h1 = data.get();
    
    WishList w = new WishList();
    w.setHname(h1.getHname());
    w.setHprice(h1.getHprice());
    w.setDescr(h1.getDescr());
    w.setHdiscount(h1.getHdiscount());
    
	
	serv.insert(w);
	
	List<WishList> l1 = serv.getAllData();
	model.addAttribute("dining",l1);
	
	
		
	return "wishlists";
	}
	
	// CLEANING SUPPLIES
	
	@RequestMapping("/wishlistcleaning/{id}")
	public String addtoWishList3(@PathVariable("id") int id, Model model) {
     
	Optional<Cleaning> data = cserv.getSingledata(id);
	
    Cleaning h1 = data.get();
    
    WishList w = new WishList();
    w.setHname(h1.getHname());
    w.setHprice(h1.getHprice());
    w.setDescr(h1.getDescr());
    w.setHdiscount(h1.getHdiscount());
    
	
	serv.insert(w);
	
	List<WishList> l1 = serv.getAllData();
	model.addAttribute("cleaning",l1);
	
	
		
	return "wishlists";
	}
	
	
	
	
	

}
