package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.PhoneWishlist;

@Repository
public interface PhoneWishlistRepository extends JpaRepository<PhoneWishlist, Integer>{

}
