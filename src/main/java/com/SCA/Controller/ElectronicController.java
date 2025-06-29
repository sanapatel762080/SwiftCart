package com.SCA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.HomeAppliances;
import com.SCA.Entities.Laptop;
import com.SCA.Entities.Phones;
import com.SCA.Entities.Television;
import com.SCA.Service.HeadSetService;
import com.SCA.Service.HomeAppliancesService;
import com.SCA.Service.LaptopService;
import com.SCA.Service.PhonesService;
import com.SCA.Service.TelevisionService;


@Controller
public class ElectronicController {
	
	@Autowired
	private HeadSetService serv;
	
	@Autowired
	private TelevisionService tserv;
	
	@Autowired
	private PhonesService pserv;
	
	@Autowired
	private LaptopService lserv;
	
	@Autowired
	private HomeAppliancesService haserv;
	
	
	@RequestMapping("/viewproducts")
	public String productDisplay() {
		
		return "viewElectronics";
	}

	// HeadSet
	
	@GetMapping("/headsetdata")
	public String getHeadSetdetails(Model model) {
		
		List<HeadSet> l1 = serv.getAllData();
		model.addAttribute("list1",l1);
		
		return "displayHeadset";
	}
	
	// ADMIN
	
	@GetMapping("/displayheadset")
	public String getHeadSetdetails1(Model model) {
		
		List<HeadSet> l1 = serv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getheadsets";
	}
	
	@RequestMapping("/deleteheadset/{hid}")
	
	public String removeHeadSet(@PathVariable("hid") int id, Model model) {
		serv.deleteHeadSet(id);
		List<HeadSet> l1 = serv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getheadsets";
	}
	
   @RequestMapping("/edit/{hid}")
	public String editHeadSet(@PathVariable("hid") int id, Model model) {
	   Optional<HeadSet> data = serv.getSingledata(id);
	   HeadSet h1 = data.get();
	   model.addAttribute("h1data",h1);
	   
		serv.getSingledata(id);
		
		return "editheadsets";
	}
   
   @PostMapping("/edith")
   public String updateHeadSet(@ModelAttribute HeadSet hs, Model model) {
	   HeadSet h1 = serv.updateInfo(hs);
	   List<HeadSet> list = serv.getAllData();
	   model.addAttribute("list1",list);
	   return "getheadsets";
   }
	
	
	// TV
	
   @GetMapping("/tvdata")
	public String getTVdetails(Model model) {
		
		List<Television> l1 = tserv.getAllData();
		model.addAttribute("list2",l1);
		
		return "displaytv";
	}
   
   @GetMapping("/displaytv")
	public String getTVdetails1(Model model) {
		
		List<Television> l1 = tserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "gettv";
	}
	
	@RequestMapping("/deletetv/{hid}")
	
	public String removeTV(@PathVariable("hid") int id, Model model) {
		tserv.deleteTV(id);
		List<Television> l1 = tserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "gettv";
	}
	
  @RequestMapping("/edittv/{hid}")
	public String editTV(@PathVariable("hid") int id, Model model) {
	   Optional<Television> data = tserv.getSingledata(id);
	   Television h1 = data.get();
	   model.addAttribute("h1data",h1);
	   
		tserv.getSingledata(id);
		
		return "edittv";
	}
  
  @PostMapping("/edithtv")
  public String updateTV(@ModelAttribute Television hs, Model model) {
	   Television h1 = tserv.updateInfo(hs);
	   List<Television> list = tserv.getAllData();
	   model.addAttribute("list1",list);
	   return "gettv";
  }
	
	
	
	// Mobile Phones
	
	@RequestMapping("/phonedata")
	public String getPhoneDetails(Model model) {
		List<Phones> l2 = pserv.getAllData();
		
		model.addAttribute("list3",l2);
		
		return "displayPhones";
	}
	
	@GetMapping("/displayphones")
	public String getPhonesdetails1(Model model) {
		
		List<Phones> l1 = pserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getphones";
	}
	
	@RequestMapping("/deletephone/{hid}")
	
	public String removePhone(@PathVariable("hid") int id, Model model) {
		pserv.deletePhone(id);
		List<Phones> l1 = pserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getphones";
	}
	
   @RequestMapping("/editphone/{hid}")
	public String editPhone(@PathVariable("hid") int id, Model model) {
	   Optional<Phones> data = pserv.getSingledata(id);
	   Phones h1 = data.get();
	   model.addAttribute("h1data",h1);
	   
		serv.getSingledata(id);
		
		return "edithphones";
	}
   
   @PostMapping("/edithphone")
   public String updatePhone(@ModelAttribute Phones hs, Model model) {
	   Phones h1 = pserv.updateInfo(hs);
	   List<Phones> list = pserv.getAllData();
	   model.addAttribute("list1",list);
	   return "getphones";
   }
	
	
	
	// LAPTOP
	
	@RequestMapping("/laptopdata")
	public String getLaptopDetails(Model model) {
		List<Laptop> l3 = lserv.getAllData();
		model.addAttribute("list4",l3);
		
		return "displaylaptop";
	}
	
	@GetMapping("/displaylapi")
	public String getLaptopdetails1(Model model) {
		
		List<Laptop> l1 = lserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getlaptop";
	}
	
	@RequestMapping("/deletelapi/{lid}")
	
	public String removeLaptop(@PathVariable("lid") int id, Model model) {
		lserv.deleteLaptop(id);
		List<Laptop> l1 = lserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getlaptop";
	}
	
   @RequestMapping("/editlapi/{lid}")
	public String editLaptop(@PathVariable("lid") int id, Model model) {
	   Optional<Laptop> data = lserv.getSingledata(id);
	   Laptop h1 = data.get();
	   model.addAttribute("h1data",h1);
	   
		serv.getSingledata(id);
		
		return "edithlaptop";
	}
   
   @PostMapping("/edithlapi")
   public String updateLaptop(@ModelAttribute Laptop hs, Model model) {
	   Laptop h1 = lserv.updateInfo(hs);
	   List<Laptop> list = lserv.getAllData();
	   model.addAttribute("list1",list);
	   return "getlaptop";
   }
	
	
	// Home Appliances
	
	@RequestMapping("/homeappliancesdata")
	public String getHomeAppliancesDetails(Model model) {
		List<HomeAppliances> l4 = haserv.getAllData();
		
		model.addAttribute("list5",l4);
		
		return "displayhomeappliance";
	}
	
	
	@GetMapping("/displayapliance")
	public String getAppliancedetails1(Model model) {
		
		List<HomeAppliances> l1 = haserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "gethomeappliance";
	}
	
	@RequestMapping("/deleteapliance/{haid}")
	
	public String removeHomeAppliance(@PathVariable("haid") int id, Model model) {
		haserv.deleteAppliance(id);
		List<HomeAppliances> l1 = haserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "gethomeappliance";
	}
	
   @RequestMapping("/editapliance/{haid}")
	public String editAppliance(@PathVariable("haid") int id, Model model) {
	   Optional<HomeAppliances> data = haserv.getSingledata(id);
	   HomeAppliances h1 = data.get();
	   model.addAttribute("h1data",h1);
	   
		serv.getSingledata(id);
		
		return "edithappliance";
	}
   
   @PostMapping("/edithapliance")
   public String updateAppliance(@ModelAttribute HomeAppliances hs, Model model) {
	   HomeAppliances h1 = haserv.updateInfo(hs);
	   List<HomeAppliances> list = haserv.getAllData();
	   model.addAttribute("list1",list);
	   return "gethomeappliance";
   }
	
	
	
	
}
