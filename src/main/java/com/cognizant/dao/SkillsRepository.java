package com.cognizant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Skills;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long>{

}
