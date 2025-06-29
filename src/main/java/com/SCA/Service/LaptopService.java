package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.Laptop;
import com.SCA.Repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository repo;
	
	public List<Laptop> getAllData(){
		List<Laptop> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<Laptop> getSingledata(int hid) {
		Optional<Laptop> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addLaptop(Laptop hs) {
		repo.save(hs);
		
	}
	
	public void deleteLaptop(int id) {
		repo.deleteById(id);
	}


	public Laptop updateInfo(Laptop hs) {
		Laptop hs1 = repo.save(hs);
		return hs1;
	}


}
