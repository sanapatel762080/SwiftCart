package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.HomeAppliances;
import com.SCA.Repository.HomeAppliancesRepository;

@Service
public class HomeAppliancesService {
	
	@Autowired
	private HomeAppliancesRepository repo;
	
	public List<HomeAppliances> getAllData(){
		List<HomeAppliances> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<HomeAppliances> getSingledata(int hid) {
		Optional<HomeAppliances> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addAppliance(HomeAppliances hs) {
		repo.save(hs);
		
	}
	
	public void deleteAppliance(int id) {
		repo.deleteById(id);
	}


	public HomeAppliances updateInfo(HomeAppliances hs) {
		HomeAppliances hs1 = repo.save(hs);
		return hs1;
	}

}
