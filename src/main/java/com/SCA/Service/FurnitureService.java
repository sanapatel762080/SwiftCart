package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.Furniture;
import com.SCA.Repository.FurnitureRepository;

@Service
public class FurnitureService {
	
	@Autowired
	private FurnitureRepository repo;
	
	public List<Furniture> getAllData(){
		List<Furniture> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<Furniture> getSingledata(int hid) {
		Optional<Furniture> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addFurniture(Furniture hs) {
		repo.save(hs);
		
	}
	
	public void deleteFurniture(int id) {
		repo.deleteById(id);
	}


	public Furniture updateInfo(Furniture hs) {
		Furniture hs1 = repo.save(hs);
		return hs1;
	}
	


}
