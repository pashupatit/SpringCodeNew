package com.cognizant.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Associate_Skills")
@IdClass(AssociateSkillsPK.class)
public class AssociateSkills implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Associate_ID")
	private long associateID;
	
	@Id
	@Column(name="Skills_ID")
	private long skillsID;
	@Column(name="Rating")
	private long rating;
	

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
	public long getRating() {
		return rating;
	}
	public void setRating(long rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "AssociateSkills [associate=" + associateID + ", skillsID=" + skillsID + ", rating=" + rating + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (associateID ^ (associateID >>> 32));
		result = prime * result + (int) (rating ^ (rating >>> 32));
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
		AssociateSkills other = (AssociateSkills) obj;
		if (associateID != other.associateID)
			return false;
		if (rating != other.rating)
			return false;
		if (skillsID != other.skillsID)
			return false;
		return true;
	}
	
}
