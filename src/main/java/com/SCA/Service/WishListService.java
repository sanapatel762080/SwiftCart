package com.SCA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.WishList;
import com.SCA.Repository.WishListRepository;

@Service
public class WishListService {
	
	@Autowired
	private WishListRepository repo;
	
	public void insert(WishList w1) {
		
		repo.save(w1);
		
	}
	
	public List<WishList> getAllData(){
		List<WishList> l1 = repo.findAll();
		
		return l1;
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

	
}
