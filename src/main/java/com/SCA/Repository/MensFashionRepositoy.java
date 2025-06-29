package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.MensFashion;

@Repository
public interface MensFashionRepositoy extends JpaRepository<MensFashion, Integer> {

}
