package com.SCA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.LaptopWishlist;
import com.SCA.Repository.LaptopWishlistRepository;

@Service
public class LaptopWishlistService {
	
	@Autowired
	private LaptopWishlistRepository lrepo;
	
	public void insert(LaptopWishlist lw) {
		lrepo.save(lw);
	}
	
	public List<LaptopWishlist> getAllData(){
		List<LaptopWishlist> list = lrepo.findAll();
		
		return list;
	}
	
	public void deleteById(int id) {
		lrepo.deleteById(id);
	}

}
