package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Associate;

public interface AssociateService {
	
	public Associate addAssociate(Associate associate);
	
	public List<Associate> getAllAssociates();
	
	public void deleteAssociate(Associate associate);
	
	public Associate getAssociateByID(long ID);
	

}
