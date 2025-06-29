package com.SCA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.OrderedProducts;
import com.SCA.Repository.OrderedProductsRepository;

@Service
public class OrderedProductsService {
	
	
	@Autowired
	private OrderedProductsRepository repo;
	
	public OrderedProducts insert(OrderedProducts op) {
		OrderedProducts op1 = repo.save(op);
		
		return op1;
	}
	
	
	public List<OrderedProducts> getAllData(){
		List<OrderedProducts> list = (List<OrderedProducts>) repo.findAll();
		return list;
	}
	

}
