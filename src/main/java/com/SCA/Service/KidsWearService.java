package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.KidsWear;
import com.SCA.Repository.KidsWearRepository;

@Service
public class KidsWearService {
	
	@Autowired
	private KidsWearRepository repo;
	
	public List<KidsWear> getAllData(){
		List<KidsWear> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<KidsWear> getSingledata(int hid) {
		Optional<KidsWear> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addKidsData(KidsWear hs) {
		repo.save(hs);
		
	}
	
	public void deleteKidsData(int id) {
		repo.deleteById(id);
	}


	public KidsWear updateInfo(KidsWear hs) {
		KidsWear hs1 = repo.save(hs);
		return hs1;
	}
	
	


}
