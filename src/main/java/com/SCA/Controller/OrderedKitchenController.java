package com.SCA.Controller;

import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SCA.Entities.Cleaning;
import com.SCA.Entities.Dining;
import com.SCA.Entities.Furniture;
import com.SCA.Entities.HeadSet;
import com.SCA.Entities.OrderedKitchen;
import com.SCA.Entities.OrderedProducts;
import com.SCA.Entities.Television;
import com.SCA.Entities.YourOrders;
import com.SCA.Service.CleaningService;
import com.SCA.Service.DiningService;
import com.SCA.Service.FurnitureService;
import com.SCA.Service.OrderedKitchenService;
import com.SCA.Service.OrderedProductsService;
import com.SCA.Service.YourOrdersService;

@Controller
public class OrderedKitchenController {
	
	@Autowired
	private YourOrdersService yserv;
	
	@Autowired
	private FurnitureService fserv;
	
	@Autowired
	private OrderedKitchenService oserv;
	
	@Autowired
	private DiningService dserv;
	
	@Autowired
	private CleaningService cserv;
	
	// FURNITURE
	
	@RequestMapping("/buyfurniture/{hid}")
	public String buyProduct1(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buyFurniture";
	}
	
	@RequestMapping("/sendDatafurniture")
	public String addedProduct1(@ModelAttribute OrderedKitchen op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
		OrderedKitchen op1 =	oserv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<Furniture> getdata = fserv.getSingledata(id);
		Furniture p = getdata.get();
		getdata.ifPresent(p1 -> model.addAttribute("pdata",p1));
		
		
		YourOrders yo = new YourOrders();
		yo.setAddress(op.getAddress());
		yo.setContact(op.getContact());
		yo.setCount(op.getCount());
		yo.setDate(op.getDate());
		yo.setDescr(p.getDescr());
		yo.setHname(p.getHname());
		yo.setHprice(p.getHprice());
		yo.setName(op.getName());
		
		
		yserv.insert(yo);
		
		return "showOrderedProduct";
	}
	
	// DINING
	
	@RequestMapping("/buydining/{hid}")
	public String buyProduct2(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buydining";
	}
	
	@RequestMapping("/sendDatadining")
	public String addedProduct2(@ModelAttribute OrderedKitchen op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
		OrderedKitchen op1 =	oserv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<Dining> getdata = dserv.getSingledata(id);
		Dining p = getdata.get();
		getdata.ifPresent(p1 -> model.addAttribute("pdata",p1));
		
		
		YourOrders yo = new YourOrders();
		yo.setAddress(op.getAddress());
		yo.setContact(op.getContact());
		yo.setCount(op.getCount());
		yo.setDate(op.getDate());
		yo.setDescr(p.getDescr());
		yo.setHname(p.getHname());
		yo.setHprice(p.getHprice());
		yo.setName(op.getName());
		
		
		yserv.insert(yo);
		
		return "showOrderedProduct";
	}

	// CLEANING SUPPLIES
	
	@RequestMapping("/buycleaning/{hid}")
	public String buyProduct3(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buycleaning";
	}
	
	@RequestMapping("/senddatacleaning")
	public String addedProduct3(@ModelAttribute OrderedKitchen op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
		OrderedKitchen op1 =	oserv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<Cleaning> getdata = cserv.getSingledata(id);
		Cleaning p = getdata.get();
		getdata.ifPresent(p1 -> model.addAttribute("pdata",p1));
		
		
		YourOrders yo = new YourOrders();
		yo.setAddress(op.getAddress());
		yo.setContact(op.getContact());
		yo.setCount(op.getCount());
		yo.setDate(op.getDate());
		yo.setDescr(p.getDescr());
		yo.setHname(p.getHname());
		yo.setHprice(p.getHprice());
		yo.setName(op.getName());
		
		
		yserv.insert(yo);
		
		return "showOrderedProduct";
	}


	
	
	


}
