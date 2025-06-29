package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.Cleaning;
import com.SCA.Repository.CleaningRepository;

@Service
public class CleaningService {
	@Autowired
	private CleaningRepository repo;
	
	public List<Cleaning> getAllData(){
		List<Cleaning> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<Cleaning> getSingledata(int hid) {
		Optional<Cleaning> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addCleaning(Cleaning hs) {
		repo.save(hs);
		
	}
	
	public void deleteCleaning(int id) {
		repo.deleteById(id);
	}


	public Cleaning updateInfo(Cleaning hs) {
		Cleaning hs1 = repo.save(hs);
		return hs1;
	}
	


}
