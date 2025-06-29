package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.Dining;
import com.SCA.Entities.HeadSet;
import com.SCA.Repository.DiningRepository;

@Service
public class DiningService {
	
	@Autowired
	private DiningRepository repo;
	
	public List<Dining> getAllData(){
		List<Dining> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<Dining> getSingledata(int hid) {
		Optional<Dining> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addDining(Dining hs) {
		repo.save(hs);
		
	}
	
	public void deleteDining(int id) {
		repo.deleteById(id);
	}


	public Dining updateInfo(Dining hs) {
		Dining hs1 = repo.save(hs);
		return hs1;
	}
	
	

}
