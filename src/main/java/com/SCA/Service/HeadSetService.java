package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.HeadSet;
import com.SCA.Repository.HeadSetRepository;

@Service
public class HeadSetService{
	
	@Autowired
	private HeadSetRepository repo;
	
	
	public List<HeadSet> getAllData(){
		List<HeadSet> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<HeadSet> getSingledata(int hid) {
		Optional<HeadSet> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addHeadSet(HeadSet hs) {
		repo.save(hs);
		
	}
	
	public void deleteHeadSet(int id) {
		repo.deleteById(id);
	}


	public HeadSet updateInfo(HeadSet hs) {
		HeadSet hs1 = repo.save(hs);
		return hs1;
	}
	
	
	

}
