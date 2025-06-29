package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.Phones;
import com.SCA.Repository.PhonesRepository;

@Service
public class PhonesService {

	@Autowired
	private PhonesRepository repo;
	
	public List<Phones> getAllData(){
		List<Phones> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<Phones> getSingledata(int hid) {
		Optional<Phones> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addPhone(Phones hs) {
		repo.save(hs);
		
	}
	
	public void deletePhone(int id) {
		repo.deleteById(id);
	}


	public Phones updateInfo(Phones hs) {
		Phones hs1 = repo.save(hs);
		return hs1;
	}
	

	
	
}
