package com.SCA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.OrderTvAndAppliances;
import com.SCA.Repository.OrderTvAndAppliancesRepository;

@Service
public class OrderTvAndAppliancesService {
	
	@Autowired
	private OrderTvAndAppliancesRepository repo;
	
	public OrderTvAndAppliances insert(OrderTvAndAppliances op) {
		OrderTvAndAppliances op1 = repo.save(op);
		
		return op1;
	}
	
	
	public List<OrderTvAndAppliances> getAllData(){
		List<OrderTvAndAppliances> list = (List<OrderTvAndAppliances>) repo.findAll();
		return list;
	}

}
