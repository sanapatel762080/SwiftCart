package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.Television;

@Repository
public interface TelevisionRepository extends JpaRepository<Television,Integer> {

}
