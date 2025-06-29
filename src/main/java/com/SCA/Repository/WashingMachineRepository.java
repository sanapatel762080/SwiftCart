package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.WashingMachine;

@Repository
public interface WashingMachineRepository extends JpaRepository<WashingMachine, Integer>{

}
