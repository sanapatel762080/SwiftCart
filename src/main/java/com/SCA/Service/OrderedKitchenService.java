package com.SCA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.OrderedKitchen;
import com.SCA.Repository.OrderedKitchenRepository;

@Service
public class OrderedKitchenService {
	
	@Autowired
	private OrderedKitchenRepository repo;
	
	public OrderedKitchen insert(OrderedKitchen op) {
		OrderedKitchen op1 = repo.save(op);
		
		return op1;
	}
	
	
	public List<OrderedKitchen> getAllData(){
		List<OrderedKitchen> list = (List<OrderedKitchen>) repo.findAll();
		return list;
	}

}
