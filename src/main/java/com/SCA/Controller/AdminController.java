package com.SCA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SCA.Entities.AC;
import com.SCA.Entities.Cleaning;
import com.SCA.Entities.Dining;
import com.SCA.Entities.Furniture;
import com.SCA.Entities.HeadSet;
import com.SCA.Entities.HomeAppliances;
import com.SCA.Entities.KidsWear;
import com.SCA.Entities.Laptop;
import com.SCA.Entities.MensFashion;
import com.SCA.Entities.Phones;
import com.SCA.Entities.Refrigerator;
import com.SCA.Entities.Television;
import com.SCA.Entities.WashingMachine;
import com.SCA.Entities.WomensFashion;
import com.SCA.Service.ACService;
import com.SCA.Service.CleaningService;
import com.SCA.Service.DiningService;
import com.SCA.Service.FurnitureService;
import com.SCA.Service.HeadSetService;
import com.SCA.Service.HomeAppliancesService;
import com.SCA.Service.KidsWearService;
import com.SCA.Service.LaptopService;
import com.SCA.Service.MensFashionService;
import com.SCA.Service.PhonesService;
import com.SCA.Service.RefrigeratorService;
import com.SCA.Service.TelevisionService;
import com.SCA.Service.WashingMachineService;
import com.SCA.Service.WomensFashionService;

@Controller
public class AdminController {
	
	@Autowired
	private HeadSetService hserv;
	
	@Autowired
	private PhonesService pserv;
	
	@Autowired
	private LaptopService lserv;
	
	@Autowired
	private HomeAppliancesService haserv;
	
	@Autowired
	private MensFashionService mserv;
	
	@Autowired
	private WomensFashionService wserv;
	
	@Autowired
	private KidsWearService kserv;
	
	@Autowired
	private FurnitureService fserv;
	
	@Autowired
	private DiningService dserv;
	
	@Autowired
	private CleaningService cserv;
	
	@Autowired
	private TelevisionService tserv;
	
	@Autowired
	private RefrigeratorService rserv;
	
	@Autowired
	private ACService aserv;
	
	@Autowired
	private WashingMachineService waserv;
	
	@RequestMapping("/categories")
	public String gotoCategory() {
		
		return "category";
	}
	
	@RequestMapping("/gotoaddingelectronic")
	public String transferToAddingElectronic() {
		
		return "addingelectronic";
	}
	
	@RequestMapping("/addheadset")
	public String addingHeadSet() {
		
		return "newheadset";
	}
	
	@PostMapping("/insertproduct")
	@ResponseBody
	public String insertingHeadSet(@ModelAttribute HeadSet hs) {
		hserv.addHeadSet(hs);
		return "Data is Addedd successfully";
		
	}
	
	// PHONES 
	
	@RequestMapping("/addphone")
	public String addingPhones() {
		
		return "newphone";
	}
	
	@PostMapping("/insertproductphone")
	@ResponseBody
	public String insertingPhone(@ModelAttribute Phones hs) {
		pserv.addPhone(hs);
		return "Data is Addedd successfully";
		
	}
	
	// LAPTOP
	
	@RequestMapping("/addlapi")
	public String addingLaptop() {
		
		return "newlaptop";
	}
	
	@PostMapping("/insertproductlapi")
	@ResponseBody
	public String insertingLaptop(@ModelAttribute Laptop hs) {
		lserv.addLaptop(hs);
		return "Data is Addedd successfully";
		
	}
	
	// HOME APPLIANCES
	
	@RequestMapping("/addapliance")
	public String addingHomeAppliance() {
		
		return "newhomeappliance";
	}
	
	@PostMapping("/insertproductappliance")
	@ResponseBody
	public String insertingHomeAppliance(@ModelAttribute HomeAppliances hs) {
		haserv.addAppliance(hs);
		return "Data is Addedd successfully";
		
	}
	
	
	
	
	// TV AND APPLIANCES
	
	@RequestMapping("/gotoaddingappliances")
	public String transferToAppliances() {
		
		return "addingappliances";
	}
	
	@RequestMapping("/addtv")
	public String addingTV() {
		
		return "newtv";
	}
	
	@PostMapping("/insertproducttv")
	@ResponseBody
	public String insertingTV(@ModelAttribute Television hs) {
		tserv.addTV(hs);
		return "Data is Addedd successfully";
		
	}
	
	// Refrigerators
	
	@RequestMapping("/addrefri")
	public String addingRefri() {
		
		return "newrefri";
	}
	
	@PostMapping("/insertproductrefri")
	@ResponseBody
	public String insertingRefri(@ModelAttribute Refrigerator hs) {
		rserv.addRefrigerator(hs);
		return "Data is Addedd successfully";
		
	}
	
	
	// AC
	
	@RequestMapping("/addac")
	public String addingAC() {
		
		return "newac";
	}
	
	@PostMapping("/insertproductac")
	@ResponseBody
	public String insertingAC(@ModelAttribute AC hs) {
		aserv.addAC(hs);
		return "Data is Addedd successfully";
		
	}
	
	// Washing Machine
	
	@RequestMapping("/addwashing")
	public String addingWashing() {
		
		return "newwashing";
	}
	
	@PostMapping("/insertproductwashing")
	@ResponseBody
	public String insertingWashing(@ModelAttribute WashingMachine hs) {
		waserv.addWashingMachine(hs);
		return "Data is Addedd successfully";
		
	}
	
	
	
	
	

	// FASHION
	// MENS
	
	@RequestMapping("/gotoaddingfashion")
	public String transferToAddingFashion() {
		
		return "addingfashion";
	}
	
	@RequestMapping("/addmens")
	public String addingMensFashion() {
		
		return "newmens";
	}
	
	@PostMapping("/insertmensproduct")
	@ResponseBody
	public String insertingMensProduct(@ModelAttribute MensFashion hs) {
		mserv.addMensProduct(hs);
		return "Data is Addedd successfully";
		
	}
	
	// wOMENS
	
	@RequestMapping("/addwomensdata")
	public String addingWomensProduct() {
		
		return "newWomensPro";
	}
	
	@PostMapping("/insertproductwomens")
	@ResponseBody
	public String insertingWomensProduct(@ModelAttribute WomensFashion hs) {
		wserv.addWomensFashion(hs);
		return "Data is Addedd successfully";
		
	}
	
	// KIDS
	
	@RequestMapping("/addkidsdata")
	public String addingKidsData() {
		
		return "newkidsdata";
	}
	
	@PostMapping("/insertproductkids")
	@ResponseBody
	public String insertingKidsdata(@ModelAttribute KidsWear hs) {
		kserv.addKidsData(hs);
		return "Data is Addedd successfully";
		
	}
	
	// HOME AND KITCHEN
	
	@RequestMapping("/gotoaddingkitchen")
	public String transferToAddingKitchen() {
		
		return "addingkitchen";
	}
	
	@RequestMapping("/addfurniture")
	public String addingFurniture() {
		
		return "newfurniture";
	}
	
	@PostMapping("/insertproductfurniture")
	@ResponseBody
	public String insertingfurniture(@ModelAttribute Furniture hs) {
		fserv.addFurniture(hs);
		return "Data is Addedd successfully";
		
	}
	
	// DINING
	
	@RequestMapping("/adddining")
	public String addingDining() {
		
		return "newdining";
	}
	
	@PostMapping("/insertproductdining")
	@ResponseBody
	public String insertingDining(@ModelAttribute Dining hs) {
		dserv.addDining(hs);
		return "Data is Addedd successfully";
		
	}
	
	// CLEANING
	
	@RequestMapping("/addcleaning")
	public String addingCleaning() {
		
		return "newcleaning";
	}
	
	@PostMapping("/insertproductcleaning")
	@ResponseBody
	public String insertingCleaningSupplies(@ModelAttribute Cleaning hs) {
		cserv.addCleaning(hs);
		return "Data is Addedd successfully";
		
	}
	
	
	

	
}
