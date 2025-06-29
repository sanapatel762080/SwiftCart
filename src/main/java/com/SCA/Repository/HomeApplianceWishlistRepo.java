package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.HomeAppliancesWishlist;

@Repository
public interface HomeApplianceWishlistRepo extends JpaRepository<HomeAppliancesWishlist, Integer>{

}
