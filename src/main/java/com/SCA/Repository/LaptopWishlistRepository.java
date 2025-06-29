package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.LaptopWishlist;

@Repository
public interface LaptopWishlistRepository extends JpaRepository<LaptopWishlist, Integer>{

}
