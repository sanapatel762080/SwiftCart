package com.SCA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SCA.Entities.YourOrders;
import com.SCA.Service.YourOrdersService;

@Controller
public class YourOrdersController {
	
	@Autowired
	private YourOrdersService serv;
	
	@RequestMapping("/returnform")
	public String returnProductForm(@RequestParam("id") int id, Model model) {
		YourOrders y1 = serv.getSingleDate(id);
		model.addAttribute("order",y1);
		return "returnForm";
		
	}
	
	@RequestMapping("/reviewform")
	public String reviewProductForm(@RequestParam("id") int id, Model model) {
		model.addAttribute("pid",id);
		return "reviewForm";
	}
	
	@RequestMapping("/return")
	public String returnProduct(Model model, @RequestParam("id") int id) {		serv.removeProduct(id);
		model.addAttribute("date", "Your Product will be picked up within 2 days");
		model.addAttribute("status","Request Accepted");
		return "returnstatus";
	}

}
