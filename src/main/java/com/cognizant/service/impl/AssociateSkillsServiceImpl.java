package com.cognizant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.cognizant.dao.AssociateSkillsRepository;
import com.cognizant.model.AssociateSkills;
import com.cognizant.service.AssociateSkillsService;

@Service("associateSkillsService")
@Transactional
public class AssociateSkillsServiceImpl implements AssociateSkillsService {
	
	@Autowired
	private AssociateSkillsRepository repo;

	@Override
	public List<AssociateSkills> addAssociateSkills(List<AssociateSkills> listOfSkills) {
		return repo.saveAll(listOfSkills);
	}

	@Override
	public List<AssociateSkills> getAllAssociateSkills(long associateID) {
		return repo.findRecordsByAssociateId(associateID);
	}

	@Override
	public void deleteAssociateSkills(List<AssociateSkills> listOfSkills) {
		repo.deleteAll(listOfSkills);
		
	}
	
}
