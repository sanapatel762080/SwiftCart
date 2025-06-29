package com.SCA.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.SCA.Entities.Reviews;
import com.SCA.Entities.YourOrders;
import com.SCA.Service.ReviewsService;
import com.SCA.Service.YourOrdersService;


@Controller
public class ReviewController {
	
	@Autowired
	private ReviewsService serv;
	
	@Autowired
	private YourOrdersService yserv;
	
	@RequestMapping(value= "/reviews", method =RequestMethod.POST)
	public ModelAndView collectReview(@RequestParam("id") int id, @RequestParam("review") String review, @RequestParam("ratings") int ratings) {
		YourOrders yo = yserv.getSingleDate(id);
		Reviews re = new Reviews();
		re.setHname(yo.getHname());
		re.setDescr(yo.getDescr());
		re.setHprice(yo.getHprice());
		re.setReview(review);
		re.setRatings(ratings);
		re.setName(yo.getName());
		
		serv.insert(re);
		List<YourOrders> l1 = yserv.getAllData();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("yourorders");
		mv.addObject("list",l1);
		
		return mv;
		
	}
	
	@RequestMapping("/showreviews")
	public String showAllReviews(Model model) {
		
		List<Reviews> list = serv.getAllData();
		model.addAttribute("l1",list);
		
		return "showreview";
		
	}
	
	

}
