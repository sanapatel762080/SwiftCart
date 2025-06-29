package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.AC;
import com.SCA.Entities.HeadSet;
import com.SCA.Repository.ACRepository;

@Service
public class ACService {
	@Autowired
	private ACRepository repo;
	
	public List<AC> getAllData(){
		List<AC> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<AC> getSingledata(int hid) {
		Optional<AC> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addAC(AC hs) {
		repo.save(hs);
		
	}
	
	public void deleteAC(int id) {
		repo.deleteById(id);
	}


	public AC updateInfo(AC hs) {
		AC hs1 = repo.save(hs);
		return hs1;
	}
	
	


}
