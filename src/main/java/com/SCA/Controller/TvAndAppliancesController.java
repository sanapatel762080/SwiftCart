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

import com.SCA.Entities.AC;
import com.SCA.Entities.HeadSet;
import com.SCA.Entities.Refrigerator;
import com.SCA.Entities.WashingMachine;
import com.SCA.Service.ACService;
import com.SCA.Service.RefrigeratorService;
import com.SCA.Service.WashingMachineService;

@Controller
public class TvAndAppliancesController {
	
	@Autowired
	private RefrigeratorService rserv;
	
	@Autowired
	private ACService aserv;
	
	@Autowired
	private WashingMachineService wserv;
	
	
	@RequestMapping("/viewappliance")
	public String productDisplay() {
		
		return "viewAppliance";
	}
	
	// Refrigerator
	
		@GetMapping("/refridata")
		public String getFridgedetails(Model model) {
			
			List<Refrigerator> l1 = rserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "displayfridge";
		}
		
		// ADMIN
		
		@GetMapping("/displayrefri")
		public String getFridgedetails1(Model model) {
			
			List<Refrigerator> l1 = rserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getfridge";
		}
		
		@RequestMapping("/deleterefri/{hid}")
		
		public String removeFridge(@PathVariable("hid") int id, Model model) {
			rserv.deleteRefrigerator(id);
			List<Refrigerator> l1 = rserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getfridge";
		}
		
	   @RequestMapping("/editrefri/{hid}")
		public String editFridge(@PathVariable("hid") int id, Model model) {
		   Optional<Refrigerator> data = rserv.getSingledata(id);
		   Refrigerator h1 = data.get();
		   model.addAttribute("h1data",h1);
		   
			rserv.getSingledata(id);
			
			return "edithfridge";
		}
	   
	   @PostMapping("/edithrefri")
	   public String updateFridge(@ModelAttribute Refrigerator hs, Model model) {
		   Refrigerator h1 = rserv.updateInfo(hs);
		   List<Refrigerator> list = rserv.getAllData();
		   model.addAttribute("list1",list);
		   return "getfridge";
	   }
	   
	   // AC
	   
	   @GetMapping("/acdata")
		public String getACdetails(Model model) {
			
			List<AC> l1 = aserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "displayac";
		}
		
		// ADMIN
		
		@GetMapping("/displayac")
		public String getACdetails1(Model model) {
			
			List<AC> l1 = aserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getac";
		}
		
		@RequestMapping("/deleteac/{hid}")
		
		public String removeAC(@PathVariable("hid") int id, Model model) {
			aserv.deleteAC(id);
			List<AC> l1 = aserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getac";
		}
		
	   @RequestMapping("/editac/{hid}")
		public String editAC(@PathVariable("hid") int id, Model model) {
		   Optional<AC> data = aserv.getSingledata(id);
		   AC h1 = data.get();
		   model.addAttribute("h1data",h1);
		   
			aserv.getSingledata(id);
			
			return "edithac";
		}
	   
	   @PostMapping("/edithac")
	   public String updateAC(@ModelAttribute AC hs, Model model) {
		   AC h1 = aserv.updateInfo(hs);
		   List<AC> list = aserv.getAllData();
		   model.addAttribute("list1",list);
		   return "getac";
	   }
	   
	   // Washing Machines
	   
	   @GetMapping("/washingdata")
		public String getWashingdetails(Model model) {
			
			List<WashingMachine> l1 = wserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "displaywashing";
		}
		
		// ADMIN3
		
		@GetMapping("/displaywashing")
		public String getWashingdetails1(Model model) {
			
			List<WashingMachine> l1 = wserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getwashing";
		}
		
		@RequestMapping("/deletewashing/{hid}")
		
		public String removeWashing(@PathVariable("hid") int id, Model model) {
			wserv.deleteWashingMachine(id);
			List<WashingMachine> l1 = wserv.getAllData();
			model.addAttribute("list1",l1);
			
			return "getwashing";
		}
		
	   @RequestMapping("/editwashing/{hid}")
		public String editWashing(@PathVariable("hid") int id, Model model) {
		   Optional<WashingMachine> data = wserv.getSingledata(id);
		   WashingMachine h1 = data.get();
		   model.addAttribute("h1data",h1);
		   
			wserv.getSingledata(id);
			
			return "edithwashing";
		}
	   
	   @PostMapping("/edithwashing")
	   public String updateWashing(@ModelAttribute WashingMachine hs, Model model) {
		   WashingMachine h1 = wserv.updateInfo(hs);
		   List<WashingMachine> list = wserv.getAllData();
		   model.addAttribute("list1",list);
		   return "getwashing";
	   }


	   
		
		
	

}
