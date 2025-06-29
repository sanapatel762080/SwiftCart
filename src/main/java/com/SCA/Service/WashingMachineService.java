package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.HeadSet;
import com.SCA.Entities.WashingMachine;
import com.SCA.Repository.WashingMachineRepository;

@Service
public class WashingMachineService {
	
	@Autowired
	private WashingMachineRepository repo;
	
	public List<WashingMachine> getAllData(){
		List<WashingMachine> l1 = repo.findAll();
		
		return l1;
	}
	
	
	public Optional<WashingMachine> getSingledata(int hid) {
		Optional<WashingMachine> h1 = repo.findById(hid);
		return h1;
	}
	
	public void addWashingMachine(WashingMachine hs) {
		repo.save(hs);
		
	}
	
	public void deleteWashingMachine(int id) {
		repo.deleteById(id);
	}


	public WashingMachine updateInfo(WashingMachine hs) {
		WashingMachine hs1 = repo.save(hs);
		return hs1;
	}


}
