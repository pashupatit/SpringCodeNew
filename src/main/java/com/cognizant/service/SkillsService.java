package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Skills;

public interface SkillsService {
	
	public Skills addSkills(Skills skills);
	
	public List<Skills> getAllSkills();
	
	public void deleteSkills(Skills skills);
	

}
