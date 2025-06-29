package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.Phones;

@Repository
public interface PhonesRepository extends JpaRepository<Phones, Integer>{

}
