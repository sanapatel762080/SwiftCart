package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.HomeAppliances;

@Repository
public interface HomeAppliancesRepository extends JpaRepository<HomeAppliances, Integer>{

}
