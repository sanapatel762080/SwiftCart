package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.YourOrders;

@Repository
public interface YourOrdersRepository extends JpaRepository<YourOrders, Integer> {

}
