package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.WomensFashion;
import com.SCA.Repository.WomensFashionRepository;

@Service
public class WomensFashionService {
	@Autowired
	private WomensFashionRepository repo;
	
	public List<WomensFashion> getAllData(){
		List<WomensFashion> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<WomensFashion> getSingledata(int hid) {
		Optional<WomensFashion> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addWomensFashion(WomensFashion hs) {
		repo.save(hs);
		
	}
	
	public void deleteWomensFashion(int id) {
		repo.deleteById(id);
	}


	public WomensFashion updateInfo(WomensFashion hs) {
		WomensFashion hs1 = repo.save(hs);
		return hs1;
	}
	

}
