package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.Cleaning;

@Repository
public interface CleaningRepository extends JpaRepository<Cleaning, Integer>{

}
