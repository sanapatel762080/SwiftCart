package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.Address;
import com.SCA.Repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository repo;
	
	public void insert(Address add) {
		repo.save(add);
	}
	
	public List<Address> getAllData(){
		List<Address> list = repo.findAll();
		
		return list;
		
	}
	
	public Address getSingleData(int pin) {
		Optional<Address> a1 = repo.findById(pin);
		Address a2 = a1.get();
		
		return a2;
	}

	public void update(Address add) {
		repo.save(add);
		
	}

	public void remove(int pin) {
		repo.deleteById(pin);
		
	}

}
