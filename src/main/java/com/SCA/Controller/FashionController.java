package com.SCA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.KidsWear;
import com.SCA.Entities.MensFashion;
import com.SCA.Entities.WomensFashion;
import com.SCA.Service.KidsWearService;
import com.SCA.Service.MensFashionService;
import com.SCA.Service.WomensFashionService;

@Controller
public class FashionController {
	
	@Autowired
	private MensFashionService mserv;
	
	@Autowired
	private WomensFashionService wserv;
	
	@Autowired
	private KidsWearService kserv;
	
	     // ADMIN
	
	@RequestMapping("/viewfashion")
	public String productDisplay() {
		
		return "viewfashion";
	}
	
	@GetMapping("/displaymens")
		public String getMensfashiondetails1(Model model) {
			
			List<MensFashion> l1 = mserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getmens";
		}
		
		@RequestMapping("/deletemens/{hid}")
		
		public String removeMensFashion(@PathVariable("hid") int id, Model model) {
			mserv.deleteMensProduct(id);
			List<MensFashion> l1 = mserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getmens";
		}
		
		@RequestMapping("/editmens/{hid}")
		public String editMensData(@PathVariable("hid") int id, Model model) {
		   Optional<MensFashion> data = mserv.getSingledata(id);
		   MensFashion h1 = data.get();
		   model.addAttribute("h1data",h1);
		   
			mserv.getSingledata(id);
			
			return "editmensdata";
		}
	   
	   @PostMapping("/edithmens")
	   public String updateMensData(@ModelAttribute MensFashion hs, Model model) {
		   MensFashion h1 = mserv.updateInfo(hs);
		   List<MensFashion> list = mserv.getAllData();
		   model.addAttribute("list1",list);
		   return "getmens";
	   }
	
//////////////////////////////////
	   @GetMapping("/womensdata")
		public String getWomensdetails(Model model) {
			
			List<WomensFashion> l1 = wserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "displaywomensfashion";
		}
		
	   
	   @GetMapping("/displaywomens")
		public String getWomensfashiondetails1(Model model) {
			
			List<WomensFashion> l1 = wserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getwomens";
		}
		
		@RequestMapping("/deletewomens/{hid}")
		
		public String removeWomensFashion(@PathVariable("hid") int id, Model model) {
			wserv.deleteWomensFashion(id);
			List<WomensFashion> l1 = wserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getwomens";
		}
		
		@RequestMapping("/editwomens/{hid}")
		public String editWomensData(@PathVariable("hid") int id, Model model) {
		   Optional<WomensFashion> data = wserv.getSingledata(id);
		   WomensFashion h1 = data.get();
		   model.addAttribute("h1data",h1);
		   
			wserv.getSingledata(id);
			
			return "editwomensdata";
		}
	   
	   @PostMapping("/edithwomens")
	   public String updateWomensData(@ModelAttribute WomensFashion hs, Model model) {
		   WomensFashion h1 = wserv.updateInfo(hs);
		   List<WomensFashion> list = wserv.getAllData();
		   model.addAttribute("list1",list);
		   return "getwomens";
	   }
	
	   ////////////////////////////////////////////
	   
	   @GetMapping("/displaykids")
		public String getKidsWeardetails1(Model model) {
			
			List<KidsWear> l1 = kserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getkids";
		}
		
		@RequestMapping("/deletekids/{hid}")
		
		public String removeKidsWear(@PathVariable("hid") int id, Model model) {
			kserv.deleteKidsData(id);
			List<KidsWear> l1 = kserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getkids";
		}
		
		@RequestMapping("/editkids/{hid}")
		public String editKidsWearData(@PathVariable("hid") int id, Model model) {
		   Optional<KidsWear> data = kserv.getSingledata(id);
		   KidsWear h1 = data.get();
		   model.addAttribute("h1data",h1);
		   
			mserv.getSingledata(id);
			
			return "editkidsdata";
		}
	   
	   @PostMapping("/edithkids")
	   public String updateKidswearData(@ModelAttribute KidsWear hs, Model model) {
		   KidsWear h1 = kserv.updateInfo(hs);
		   List<KidsWear> list = kserv.getAllData();
		   model.addAttribute("list1",list);
		   return "getkids";
	   }
	
	   ////////////////////////////////////////////
	
	// MENS FASHION
	
	@GetMapping("/mensdata")
	public String getMensFashiondetails(Model model) {
		
		List<MensFashion> l1 = mserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "displaymensfashion";
	}
	
	// KIDS  
	
	@GetMapping("/kidsdata")
	public String getKidsWeardetails(Model model) {
		
		List<KidsWear> l1 = kserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "displaykidsfashion";
	}
	
	
	
	
	

}
