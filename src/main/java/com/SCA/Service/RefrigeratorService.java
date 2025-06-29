package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.Refrigerator;
import com.SCA.Repository.RefrigeratorRepository;

@Service
public class RefrigeratorService {
	
	@Autowired
	private RefrigeratorRepository repo;
	
	public List<Refrigerator> getAllData(){
		List<Refrigerator> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<Refrigerator> getSingledata(int hid) {
		Optional<Refrigerator> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addRefrigerator(Refrigerator hs) {
		repo.save(hs);
		
	}
	
	public void deleteRefrigerator(int id) {
		repo.deleteById(id);
	}


	public Refrigerator updateInfo(Refrigerator hs) {
		Refrigerator hs1 = repo.save(hs);
		return hs1;
	}
	


}
