package com.SCA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.SCA.Entities.YourOrders;
import com.SCA.Repository.YourOrdersRepository;

@Service
public class YourOrdersService {
	
	@Autowired
	private YourOrdersRepository yoserv;
	
	public void insert(YourOrders yo) {
		
		yoserv.save(yo);
		
	}

	public List<YourOrders> getAllData(){
		List<YourOrders> l1 = yoserv.findAll();
		
		return l1;
	}
	
	public YourOrders getSingleDate(int id) {
		Optional<YourOrders> y = yoserv.findById(id);
		YourOrders y1 = y.get();
      return y1;
				
	}
	
	public void removeProduct(int id) {
		yoserv.deleteById(id);
	}
}
