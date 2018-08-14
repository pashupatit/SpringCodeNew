package com.cognizant.model;

import java.io.Serializable;

public class AssociateSkillsPK implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long associateID;
	private long skillsID;
	
	public long getAssociateID() {
		return associateID;
	}
	public void setAssociateID(long associateID) {
		this.associateID = associateID;
	}
	public long getSkillsID() {
		return skillsID;
	}
	public void setSkillsID(long skillsID) {
		this.skillsID = skillsID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (associateID ^ (associateID >>> 32));
		result = prime * result + (int) (skillsID ^ (skillsID >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AssociateSkillsPK other = (AssociateSkillsPK) obj;
		if (associateID != other.associateID)
			return false;
		if (skillsID != other.skillsID)
			return false;
		return true;
	}

}
