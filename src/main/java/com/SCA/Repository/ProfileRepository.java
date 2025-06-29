package com.SCA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SCA.Entities.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, String>{

	@Query("select p from Profile p where p.email =:email")
	public Profile findbyemail(@Param("email") String email);
}
