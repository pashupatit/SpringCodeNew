package com.cognizant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.AssociateRepository;
import com.cognizant.model.Associate;
import com.cognizant.service.AssociateService;

@Service("associateService")
@Transactional
public class AssociateServiceImpl implements AssociateService {

	@Autowired
	private AssociateRepository associateRepository;
	
	@Override
	public Associate addAssociate(Associate associate) {
		return associateRepository.save(associate);
	}

	@Override
	public List<Associate> getAllAssociates() {
		return associateRepository.findAll(); 
	}

	@Override
	public void deleteAssociate(Associate associate) {
		associateRepository.delete(associate);
	}

	@Override
	public Associate getAssociateByID(long ID) {
		return associateRepository.getAssociateByID(ID);
	}

}
