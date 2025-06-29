package com.SCA.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SCA.Entities.HomeAppliancesWishlist;
import com.SCA.Repository.HomeApplianceWishlistRepo;

@Service
public class HomeApplianceWishlistService {
	
	@Autowired
	private HomeApplianceWishlistRepo hwrepo;
	
	public void insert(HomeAppliancesWishlist hw) {
		hwrepo.save(hw);
	}
	
	public List<HomeAppliancesWishlist> getAllData(){
		List<HomeAppliancesWishlist> list = hwrepo.findAll();
		
		return list;
	}
	
	public void deleteById(int id) {
		hwrepo.deleteById(id);
	}

}
