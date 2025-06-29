package com.SCA.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.Profile;
import com.SCA.Repository.ProfileRepository;

@Service
public class ProfileService {
	
	
	@Autowired
	private ProfileRepository repo;
	
	public Profile insertData(Profile p) {
		Profile pro = repo.save(p);
		
		return pro;
		
	}

}
