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

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.HomeAppliances;
import com.SCA.Entities.Laptop;
import com.SCA.Entities.OrderedProducts;
import com.SCA.Entities.Phones;
import com.SCA.Entities.Television;
import com.SCA.Entities.YourOrders;
import com.SCA.Service.HeadSetService;
import com.SCA.Service.HomeAppliancesService;
import com.SCA.Service.LaptopService;
import com.SCA.Service.OrderedProductsService;
import com.SCA.Service.PhonesService;
import com.SCA.Service.TelevisionService;
import com.SCA.Service.YourOrdersService;

@Controller
public class OrderedProductsController {
	
	@Autowired
	private OrderedProductsService serv;
	
	@Autowired
	private HeadSetService hserv;
	
	@Autowired
	private YourOrdersService yserv;
	
	@Autowired
	private TelevisionService tserv;
	
	@Autowired
	private PhonesService pserv;
	
	@Autowired
	private LaptopService lserv;
	
	@Autowired
	private HomeAppliancesService haserv;
	
	
	@RequestMapping("/buy/{hid}")
	public String buyProduct(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buyheadset";
	}
	
	@RequestMapping("/sendData")
	public String addedProduct(@ModelAttribute OrderedProducts op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
	    OrderedProducts op1 =	serv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<HeadSet> getdata = hserv.getSingledata(id);
		HeadSet p = getdata.get();
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
	
	// TV
	@RequestMapping("/buytv/{hid}")
	public String buyProductTV(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buytv";
	}
	
	@RequestMapping("/sendDatatv")
	public String addedProductTV(@ModelAttribute OrderedProducts op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
	    OrderedProducts op1 =	serv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<Television> getdata = tserv.getSingledata(id);
		Television p = getdata.get();
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

		
	// Mobile Phones
	
	@RequestMapping("/buyphone/{hid}")
	public String buyProduct2(@PathVariable("hid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buyphone";
	}
	
	@RequestMapping("/sendDataphones")
	public String addedProduct2(@ModelAttribute OrderedProducts op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
	    OrderedProducts op1 =	serv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<Phones> getdata = pserv.getSingledata(id);
		Phones p = getdata.get();
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
	
	// LAPTOP
	
	@RequestMapping("/buylapi/{lid}")
	public String buyProduct3(@PathVariable("lid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buylaptop";
	}
	
	@RequestMapping("/sendDatalapi")
	public String addedProduct3(@ModelAttribute OrderedProducts op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
	    OrderedProducts op1 =	serv.insert(op);
		model.addAttribute("product",op1);
		
	
		
		
		Optional<Laptop> getdata = lserv.getSingledata(id);
		Laptop p = getdata.get();
		getdata.ifPresent(p1 -> model.addAttribute("pdata",p1));
		
		
		YourOrders yo = new YourOrders();
		yo.setAddress(op.getAddress());
		yo.setContact(op.getContact());
		yo.setCount(op.getCount());
		yo.setDate(op.getDate());
		yo.setDescr(p.getLdescr());
		yo.setHname(p.getLname());
		yo.setHprice(p.getLprice());
		yo.setName(op.getName());
		
		
		yserv.insert(yo);
		
		return "showOrderedProduct";
	}
	
	// HOME APPLIANCES
	
	@RequestMapping("/buyappliances/{haid}")
	public String buyProduct4(@PathVariable("haid") int id, Model model){
	
		model.addAttribute("hid",id);
	  
		return "buyaapliances";
	}
	
	@RequestMapping("/sendDataappliance")
	public String addedProduct4(@ModelAttribute OrderedProducts op, @RequestParam("hid") int id, Model model) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,3);
		Date deliveryDate = cal.getTime();
		op.setDate(deliveryDate);

			
	    OrderedProducts op1 =	serv.insert(op);
		model.addAttribute("product",op1);
		
		Optional<HomeAppliances> getdata = haserv.getSingledata(id);

		if (getdata.isPresent()) {
		    HomeAppliances p = getdata.get();
		    model.addAttribute("pdata", p);

		    YourOrders yo = new YourOrders();
		    yo.setAddress(op.getAddress());
		    yo.setContact(op.getContact());
		    yo.setCount(op.getCount());
		    yo.setDate(op.getDate());
		    yo.setDescr(p.getHadescr());
		    yo.setHname(p.getHaname());
		    yo.setHprice(p.getHaprice());
		    yo.setName(op.getName());

		    yserv.insert(yo);
		    
		    model.addAttribute("product", op1);
		}
		    return "showOrderedProduct";
		
	
		
	}
}