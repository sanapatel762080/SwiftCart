package com.SCA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SCA.Entities.Address;
import com.SCA.Service.AddressService;

@Controller
public class AddressController {
	
	@Autowired
	private AddressService serv;
	
	@RequestMapping("/addform")
	public String addAddress(Model model) {
		List<Address> l1 = serv.getAllData();
		model.addAttribute("list",l1);
		return "showaddresses";
	}
	
	@RequestMapping("/newadd")
	public String gotoaddform() {
		return "addressform";
	}
	
	@RequestMapping("/addnewaddress")
	public String newaddress(@ModelAttribute Address add, Model model) {
		serv.insert(add);
		List<Address> l1 = serv.getAllData();
		model.addAttribute("list",l1);
		return "showaddresses";
	}

	@RequestMapping("/editadd/{pin}")
	public String editAddress(@PathVariable("pin") int pin, Model model) {
		Address add1 = serv.getSingleData(pin);
		model.addAttribute("address",add1);
		return "editaddform";
	}
	
	@RequestMapping("/updateadd")
	public String updateAddress(@ModelAttribute Address add, Model model) {
		serv.update(add);
		List<Address> l1 = serv.getAllData();
		model.addAttribute("list",l1);
		return "showaddresses";
	}
	
	@RequestMapping("/removeadd/{pin}")
	public String removeAddress(@PathVariable("pin") int pin,Model model) {
		serv.remove(pin);
		List<Address> l1 = serv.getAllData();
		model.addAttribute("list",l1);
		return "showaddresses";
	}
}
