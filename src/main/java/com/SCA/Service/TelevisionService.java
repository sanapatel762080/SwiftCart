package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.Television;
import com.SCA.Repository.TelevisionRepository;

@Service
public class TelevisionService {
	
	@Autowired
	private TelevisionRepository repo;
	
	public List<Television> getAllData(){
		List<Television> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<Television> getSingledata(int hid) {
		Optional<Television> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addTV(Television hs) {
		repo.save(hs);
		
	}
	
	public void deleteTV(int id) {
		repo.deleteById(id);
	}


	public Television updateInfo(Television hs) {
		Television hs1 = repo.save(hs);
		return hs1;
	}

}
