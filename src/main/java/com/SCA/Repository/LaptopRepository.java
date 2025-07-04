package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
