package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.AC;

@Repository
public interface ACRepository extends JpaRepository<AC, Integer>{

}
