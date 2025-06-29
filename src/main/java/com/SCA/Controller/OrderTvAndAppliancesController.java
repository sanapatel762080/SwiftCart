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

import com.SCA.Entities.AC;
import com.SCA.Entities.OrderTvAndAppliances;
import com.SCA.Entities.Refrigerator;
import com.SCA.Entities.WashingMachine;
import com.SCA.Entities.YourOrders;
import com.SCA.Service.ACService;
import com.SCA.Service.OrderTvAndAppliancesService;
import com.SCA.Service.RefrigeratorService;
import com.SCA.Service.WashingMachineService;
import com.SCA.Service.YourOrdersService;

@Controller
public class OrderTvAndAppliancesController {
	@Autowired
	private YourOrdersService yserv;

	@Autowired
	private OrderTvAndAppliancesService oserv;
	
	@Autowired
	private RefrigeratorService rserv;
	
	@Autowired
	private ACService aserv;
	
	@Autowired
	private WashingMachineService wserv;
	
	// FRIDGE
	
	@RequestMapping("/buyrefri/{hid}")
	public String buyProduct1(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buyfridge";
	}
	
	@RequestMapping("/sendDatarefri")
	public String addedProduct1(@ModelAttribute OrderTvAndAppliances op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
		OrderTvAndAppliances op1 =	oserv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<Refrigerator> getdata = rserv.getSingledata(id);
		Refrigerator p = getdata.get();
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
	
	// AC
	
	@RequestMapping("/buyac/{hid}")
	public String buyProduct2(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buyac";
	}
	
	@RequestMapping("/sendDataac")
	public String addedProduct2(@ModelAttribute OrderTvAndAppliances op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
		OrderTvAndAppliances op1 =	oserv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<AC> getdata = aserv.getSingledata(id);
		AC p = getdata.get();
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
	
	// Washing Machine
	
	@RequestMapping("/buywashing/{hid}")
	public String buyProduct3(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buywashing";
	}
	
	@RequestMapping("/sendDatawashing")
	public String addedProduct3(@ModelAttribute OrderTvAndAppliances op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
		OrderTvAndAppliances op1 =	oserv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<WashingMachine> getdata = wserv.getSingledata(id);
		WashingMachine p = getdata.get();
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
