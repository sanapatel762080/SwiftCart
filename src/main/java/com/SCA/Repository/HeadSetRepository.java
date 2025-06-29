package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.HeadSet;

@Repository
public interface HeadSetRepository extends JpaRepository<HeadSet, Integer>{

}
