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

import com.SCA.Entities.Cleaning;
import com.SCA.Entities.Dining;
import com.SCA.Entities.Furniture;
import com.SCA.Service.CleaningService;
import com.SCA.Service.DiningService;
import com.SCA.Service.FurnitureService;

@Controller
public class KitchenController {
	
	@Autowired
	private FurnitureService fserv;
	
	@Autowired
	private DiningService dserv;
	
	@Autowired
	private CleaningService cserv;
	
	@RequestMapping("/viewkitchen")
	public String productDisplay() {
		
		return "viewkitchen";
	}
	
	// ADMIN
	
	@GetMapping("/displayfurniture")
	public String getFurnituredetails1(Model model) {
		
		List<Furniture> l1 = fserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getfurniture";
	}
	
   @RequestMapping("/deletefurniture/{hid}")
	
	public String removeFurniture(@PathVariable("hid") int id, Model model) {
		fserv.deleteFurniture(id);
		List<Furniture> l1 = fserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getfurniture";
	}
	
   @RequestMapping("/editfurniture/{hid}")
	public String editfurniture(@PathVariable("hid") int id, Model model) {
	   Optional<Furniture> data = fserv.getSingledata(id);
	   Furniture h1 = data.get();
	   model.addAttribute("h1data",h1);
	   
		fserv.getSingledata(id);
		
		return "edithfurniture";
	}
   
   @PostMapping("/edithfurniture")
   public String updateFurniture(@ModelAttribute Furniture hs, Model model) {
	   Furniture h1 = fserv.updateInfo(hs);
	   List<Furniture> list = fserv.getAllData();
	   model.addAttribute("list1",list);
	   return "getfurniture";
   }
   
   /////////////////////////////////
   
   @GetMapping("/displaydining")
	public String getDiningdetails1(Model model) {
		
		List<Dining> l1 = dserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getdining";
	}
	
  @RequestMapping("/deletedining/{hid}")
	
	public String removeDining(@PathVariable("hid") int id, Model model) {
		dserv.deleteDining(id);
		List<Dining> l1 = dserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getdining";
	}
	
  @RequestMapping("/editdining/{hid}")
	public String editDining(@PathVariable("hid") int id, Model model) {
	   Optional<Dining> data = dserv.getSingledata(id);
	   Dining h1 = data.get();
	   model.addAttribute("h1data",h1);
	   
		dserv.getSingledata(id);
		
		return "edithdining";
	}
  
  @PostMapping("/edithdining")
  public String updateDining(@ModelAttribute Dining hs, Model model) {
	   Dining h1 = dserv.updateInfo(hs);
	   List<Dining> list = dserv.getAllData();
	   model.addAttribute("list1",list);
	   return "getdining";
  }
  
   
   /////////////////////////////////
  
  @GetMapping("/displaycleaning")
	public String getCleaningdetails1(Model model) {
		
		List<Cleaning> l1 = cserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getcleaning";
	}
	
@RequestMapping("/deletecleaning/{hid}")
	
	public String removeCleaning(@PathVariable("hid") int id, Model model) {
		cserv.deleteCleaning(id);
		List<Cleaning> l1 = cserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "getcleaning";
	}
	
@RequestMapping("/editcleaning/{hid}")
	public String editCleaning(@PathVariable("hid") int id, Model model) {
	   Optional<Cleaning> data = cserv.getSingledata(id);
	   Cleaning h1 = data.get();
	   model.addAttribute("h1data",h1);
	   
		cserv.getSingledata(id);
		
		return "edithcleaning";
	}

@PostMapping("/edithcleaning")
public String updateCleaning(@ModelAttribute Cleaning hs, Model model) {
	   Cleaning h1 = cserv.updateInfo(hs);
	   List<Cleaning> list = cserv.getAllData();
	   model.addAttribute("list1",list);
	   return "getcleaning";
}

  
  //////////////////////////////////
   
   
	
	
	
	
	
	// FURNITURE
	@GetMapping("/furnituredata")
	public String getFurnituredetails(Model model) {
		
		List<Furniture> l1 = fserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "displayFurniture";
	}
	
	// DINING
	
	@GetMapping("/diningdata")
	public String getDiningdetails(Model model) {
		
		List<Dining> l1 = dserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "displaydining";
	}
	
	// CLEANING SUPPLIES
	
	@GetMapping("/cleaningdata")
	public String getCleaningdetails(Model model) {
		
		List<Cleaning> l1 = cserv.getAllData();
		model.addAttribute("list1",l1);
		
		return "displaycleaning";
	}
	
	
	
	
	
	

}
