package com.SCA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.PhoneWishlist;
import com.SCA.Repository.PhoneWishlistRepository;

@Service
public class PhoneWishlistService {
	
	@Autowired
	private PhoneWishlistRepository prepo;
	
	public void insert(PhoneWishlist pw) {
		
		prepo.save(pw);
		
	}
	
	public List<PhoneWishlist> getAllData(){
		List<PhoneWishlist> list = prepo.findAll();
		return list;
	}
	
	public void deleteById(int id) {
		prepo.deleteById(id);
	}

}
