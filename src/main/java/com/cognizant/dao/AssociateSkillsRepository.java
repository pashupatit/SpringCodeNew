package com.cognizant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.model.AssociateSkills;
import com.cognizant.model.AssociateSkillsPK;

@Repository
public interface AssociateSkillsRepository extends JpaRepository<AssociateSkills, AssociateSkillsPK>{
	
	@Query(value="SELECT * FROM associate_skills a where a.associate_id = :id",nativeQuery=true) 
    List<AssociateSkills> findRecordsByAssociateId(@Param("id") Long id);

}
