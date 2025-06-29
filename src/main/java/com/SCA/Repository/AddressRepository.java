package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer>{

}
