package com.cognizant.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Skills")
public class Skills implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Skills_ID")
	private long skillsID;
	
	@Column(name="Skills_Name")
	private String skillsName;
	
	
	public long getSkillsID() {
		return skillsID;
	}
	public void setSkillsID(long skillsID) {
		this.skillsID = skillsID;
	}
	public String getSkillsName() {
		return skillsName;
	}
	public void setSkillsName(String skillsName) {
		this.skillsName = skillsName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (skillsID ^ (skillsID >>> 32));
		result = prime * result + ((skillsName == null) ? 0 : skillsName.hashCode());
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
		Skills other = (Skills) obj;
		if (skillsID != other.skillsID)
			return false;
		if (skillsName == null) {
			if (other.skillsName != null)
				return false;
		} else if (!skillsName.equals(other.skillsName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Skills [skillsID=" + skillsID + ", skillsName=" + skillsName + "]";
	}
	
	

}
