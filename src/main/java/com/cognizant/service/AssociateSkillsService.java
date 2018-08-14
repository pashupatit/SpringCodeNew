package com.cognizant.service;

import java.util.List;

import com.cognizant.model.AssociateSkills;

public interface AssociateSkillsService {
	
	public List<AssociateSkills> addAssociateSkills(List<AssociateSkills> listOfSkills);
	
	public List<AssociateSkills> getAllAssociateSkills(long associateID);
	
	public void deleteAssociateSkills(List<AssociateSkills> listOfSkills);
	

}
