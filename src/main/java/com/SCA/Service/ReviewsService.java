package com.SCA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.Reviews;
import com.SCA.Repository.ReviewsRepository;

@Service
public class ReviewsService {
	
	@Autowired
	private ReviewsRepository repo;
	
	public void insert(Reviews rv) {
		repo.save(rv);
	}
	
	public List<Reviews> getAllData(){
		List<Reviews> l1 = repo.findAll();
		
		return l1;
	}
	

}
