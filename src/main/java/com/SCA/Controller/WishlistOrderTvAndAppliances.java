package com.SCA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SCA.Entities.AC;
import com.SCA.Entities.Refrigerator;
import com.SCA.Entities.WashingMachine;
import com.SCA.Entities.WishList;
import com.SCA.Service.ACService;
import com.SCA.Service.RefrigeratorService;
import com.SCA.Service.WashingMachineService;
import com.SCA.Service.WishListService;

@Controller
public class WishlistOrderTvAndAppliances {
	
	@Autowired
	private WishListService serv;
	
	@Autowired
	private RefrigeratorService rserv;
	
	@Autowired
	private ACService aserv;
	
	@Autowired
	private WashingMachineService wserv;
	
	   // FRIDGE
	
		@RequestMapping("/wishlistrefri/{id}")
		public String addtoWishList1(@PathVariable("id") int id, Model model) {
	     
		Optional<Refrigerator> data = rserv.getSingledata(id);
		
	    Refrigerator h1 = data.get();
	    
	    WishList w = new WishList();
	    w.setHname(h1.getHname());
	    w.setHprice(h1.getHprice());
	    w.setDescr(h1.getDescr());
	    w.setHdiscount(h1.getHdiscount());
	    
		
		serv.insert(w);
		
		List<WishList> l1 = serv.getAllData();
		model.addAttribute("refri",l1);
		
		
			
		return "wishlists";
		}
		
		@RequestMapping("/removerefri/{hid}")
		public String removeData1(@PathVariable("hid") int id, Model model) {
			
			serv.delete(id);
			
			List<WishList> l1 = serv.getAllData();
			model.addAttribute("list",l1);
			return "wishlists";
		}
		
		
		
		// AC
		
		@RequestMapping("/wishlistac/{id}")
		public String addtoWishList2(@PathVariable("id") int id, Model model) {
	     
		Optional<AC> data = aserv.getSingledata(id);
		
	    AC h1 = data.get();
	    
	    WishList w = new WishList();
	    w.setHname(h1.getHname());
	    w.setHprice(h1.getHprice());
	    w.setDescr(h1.getDescr());
	    w.setHdiscount(h1.getHdiscount());
	    
		
		serv.insert(w);
		
		List<WishList> l1 = serv.getAllData();
		model.addAttribute("ac",l1);
		
		
			
		return "wishlists";
		}
		
		@RequestMapping("/removeac/{hid}")
		public String removeData2(@PathVariable("hid") int id, Model model) {
			
			serv.delete(id);
			
			List<WishList> l1 = serv.getAllData();
			model.addAttribute("list",l1);
			return "wishlists";
		}
		
		// Washing Machine
		
		@RequestMapping("/wishlistwashing/{id}")
		public String addtoWishList3(@PathVariable("id") int id, Model model) {
	     
		Optional<WashingMachine> data = wserv.getSingledata(id);
		
	    WashingMachine h1 = data.get();
	    
	    WishList w = new WishList();
	    w.setHname(h1.getHname());
	    w.setHprice(h1.getHprice());
	    w.setDescr(h1.getDescr());
	    w.setHdiscount(h1.getHdiscount());
	    
		
		serv.insert(w);
		
		List<WishList> l1 = serv.getAllData();
		model.addAttribute("washing",l1);
		
		
			
		return "wishlists";
		}
		
		@RequestMapping("/removewashing/{hid}")
		public String removeData3(@PathVariable("hid") int id, Model model) {
			
			serv.delete(id);
			
			List<WishList> l1 = serv.getAllData();
			model.addAttribute("list",l1);
			return "wishlists";
		}
		
		



}
