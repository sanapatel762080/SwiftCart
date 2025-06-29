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

import com.SCA.Entities.KidsWear;
import com.SCA.Entities.MensFashion;
import com.SCA.Entities.OrderedFashionProducts;
import com.SCA.Entities.WomensFashion;
import com.SCA.Entities.YourOrders;
import com.SCA.Service.KidsWearService;
import com.SCA.Service.MensFashionService;
import com.SCA.Service.OrderedFashionProductsService;
import com.SCA.Service.WomensFashionService;
import com.SCA.Service.YourOrdersService;

@Controller
public class OrderedFashionProductsController {
	
	@Autowired
	private OrderedFashionProductsService serv;
	
	@Autowired
	private MensFashionService mserv;
	
	@Autowired
	private YourOrdersService yserv;
	
	@Autowired
	private WomensFashionService wserv;
	
	@Autowired
	private KidsWearService kserv;
	
	@RequestMapping("/buymens/{hid}")
	public String buyProduct(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buymens";
	}

	@RequestMapping("/sendmensData")
	public String addedProduct(@ModelAttribute OrderedFashionProducts op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
		OrderedFashionProducts op1 =	serv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<MensFashion> getdata = mserv.getSingledata(id);
		MensFashion p = getdata.get();
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
	
	// womens
	
	@RequestMapping("/buywomens/{hid}")
	public String buyProduct1(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buywomens";
	}

	@RequestMapping("/sendwomensData")
	public String addedProduct1(@ModelAttribute OrderedFashionProducts op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
		OrderedFashionProducts op1 =	serv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<WomensFashion> getdata = wserv.getSingledata(id);
		WomensFashion p = getdata.get();
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
	
	// KIDS
	
	@RequestMapping("/buykids/{hid}")
	public String buyProduct2(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buykidswear";
	}

	@RequestMapping("/sendDataKids")
	public String addedProduct2(@ModelAttribute OrderedFashionProducts op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
		OrderedFashionProducts op1 =	serv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<KidsWear> getdata = kserv.getSingledata(id);
		KidsWear p = getdata.get();
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
