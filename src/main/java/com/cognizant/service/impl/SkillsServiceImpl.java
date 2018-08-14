package com.cognizant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.SkillsRepository;
import com.cognizant.model.Skills;
import com.cognizant.service.SkillsService;

@Service("skillsService")
@Transactional
public class SkillsServiceImpl implements SkillsService {
	
	@Autowired
	private SkillsRepository skillsRepository;

	@Override
	public Skills addSkills(Skills skills) {
		return skillsRepository.save(skills);
	}

	@Override
	public List<Skills> getAllSkills() {
		return skillsRepository.findAll();
		
	}

	@Override
	public void deleteSkills(Skills skills) {
		skillsRepository.delete(skills);
	}

}
