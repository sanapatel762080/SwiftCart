package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.OrderTvAndAppliances;

@Repository
public interface OrderTvAndAppliancesRepository extends JpaRepository<OrderTvAndAppliances, Integer>{

}
