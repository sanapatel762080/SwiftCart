package com.SCA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.OrderedFashionProducts;
import com.SCA.Repository.OrderedFashionProductsRepository;

@Service
public class OrderedFashionProductsService {
	
	@Autowired
	private OrderedFashionProductsRepository repo;
	
	public OrderedFashionProducts insert(OrderedFashionProducts op) {
		OrderedFashionProducts op1 = repo.save(op);
		
		return op1;
	}
	
	
	public List<OrderedFashionProducts> getAllData(){
		List<OrderedFashionProducts> list = (List<OrderedFashionProducts>) repo.findAll();
		return list;
	}
	

}
