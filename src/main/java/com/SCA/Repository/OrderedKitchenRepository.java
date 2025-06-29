package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.OrderedKitchen;

@Repository
public interface OrderedKitchenRepository extends JpaRepository<OrderedKitchen, Integer>{

}
