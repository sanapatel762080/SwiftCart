package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.MensFashion;
import com.SCA.Repository.MensFashionRepositoy;

@Service
public class MensFashionService {
	
	@Autowired
	private MensFashionRepositoy repo;

	public List<MensFashion> getAllData(){
		List<MensFashion> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<MensFashion> getSingledata(int hid) {
		Optional<MensFashion> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addMensProduct(MensFashion hs) {
		repo.save(hs);
		
	}
	
	public void deleteMensProduct(int id) {
		repo.deleteById(id);
	}


	public MensFashion updateInfo(MensFashion hs) {
		MensFashion hs1 = repo.save(hs);
		return hs1;
	}
	
	

}
