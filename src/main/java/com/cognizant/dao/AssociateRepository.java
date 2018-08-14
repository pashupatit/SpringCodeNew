package com.cognizant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Associate;

@Repository
public interface AssociateRepository extends JpaRepository<Associate, Long>{
	
	@Query(value="SELECT * FROM associate a where a.associate_id = :id",nativeQuery=true) 
    Associate getAssociateByID(@Param("id") Long id);

}
