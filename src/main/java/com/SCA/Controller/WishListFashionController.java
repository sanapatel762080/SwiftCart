package com.SCA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.KidsWear;
import com.SCA.Entities.MensFashion;
import com.SCA.Entities.WishList;
import com.SCA.Entities.WomensFashion;
import com.SCA.Service.KidsWearService;
import com.SCA.Service.MensFashionService;
import com.SCA.Service.WishListService;
import com.SCA.Service.WomensFashionService;

@Controller
public class WishListFashionController {
	
	@Autowired
	private WishListService serv;
	
	@Autowired
	private MensFashionService mserv;
	
	@Autowired
	private WomensFashionService wserv;
	
	@Autowired
	private KidsWearService kserv;
	
	// Mens fashion
	
		@RequestMapping("/wishlistmens/{id}")
		public String addtoWishList(@PathVariable("id") int id, Model model) {
	     
		Optional<MensFashion> data = mserv.getSingledata(id);
		
	    MensFashion h1 = data.get();
	    
	    WishList w = new WishList();
	    w.setHname(h1.getHname());
	    w.setHprice(h1.getHprice());
	    w.setDescr(h1.getDescr());
	    w.setHdiscount(h1.getHdiscount());
	    
		
		serv.insert(w);
		
		List<WishList> l1 = serv.getAllData();
		model.addAttribute("mens",l1);
		
		
			
		return "wishlists";
		}
		

		@RequestMapping("/removemen/{hid}")
		public String removeData(@PathVariable("hid") int id, Model model) {
			
			serv.delete(id);
			
			List<WishList> l1 = serv.getAllData();
			model.addAttribute("mens",l1);
			return "wishlists";
		}
		
		// Womens
		
		@RequestMapping("/wishlistwomens/{id}")
		public String addtoWishList1(@PathVariable("id") int id, Model model) {
	     
		Optional<WomensFashion> data = wserv.getSingledata(id);
		
	    WomensFashion h1 = data.get();
	    
	    WishList w = new WishList();
	    w.setHname(h1.getHname());
	    w.setHprice(h1.getHprice());
	    w.setDescr(h1.getDescr());
	    w.setHdiscount(h1.getHdiscount());
	    
		
		serv.insert(w);
		
		List<WishList> l1 = serv.getAllData();
		model.addAttribute("womens",l1);
		
		
			
		return "wishlists";
		}
		

		@RequestMapping("/removewomen/{hid}")
		public String removeDataWomen(@PathVariable("hid") int id, Model model) {
			
			serv.delete(id);
			
			List<WishList> l1 = serv.getAllData();
			model.addAttribute("womens",l1);
			return "wishlists";
		}
		
		// KIDS
		
		@RequestMapping("/wishlistkids/{id}")
		public String addtoWishList2(@PathVariable("id") int id, Model model) {
	     
		Optional<KidsWear> data = kserv.getSingledata(id);
		
	    KidsWear h1 = data.get();
	    
	    WishList w = new WishList();
	    w.setHname(h1.getHname());
	    w.setHprice(h1.getHprice());
	    w.setDescr(h1.getDescr());
	    w.setHdiscount(h1.getHdiscount());
	    
		
		serv.insert(w);
		
		List<WishList> l1 = serv.getAllData();
		model.addAttribute("kids",l1);
		
		
			
		return "wishlists";
		}
		

		@RequestMapping("/removekid/{hid}")
		public String removeDataKids(@PathVariable("hid") int id, Model model) {
			
			serv.delete(id);
			
			List<WishList> l1 = serv.getAllData();
			model.addAttribute("kids",l1);
			return "wishlists";
		}
	
		
		
		
		

}
