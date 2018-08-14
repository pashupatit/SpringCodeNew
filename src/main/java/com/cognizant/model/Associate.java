package com.cognizant.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="Associate")
public class Associate implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Associate_ID")
	private long associateID;
	@Column(name="Name")
	private String name;
	@Column(name="Email")
	private String email;
	@Column(name="Mobile")
	private long mobile;
	@Column(name="Pic")
	private String pic;
	@Column(name="Status")
	private String status;
	@Column(name="Level")
	private int level;
	@Column(name="Remark")
	private String remark;
	@Column(name="Strength")
	private String strength;
	@Column(name="Weakness")
	private String weakness;
	
	public long getAssociateID() {
		return associateID;
	}
	public void setAssociateID(long associateID) {
		this.associateID = associateID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public String getWeakness() {
		return weakness;
	}
	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (associateID ^ (associateID >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + level;
		result = prime * result + (int) (mobile ^ (mobile >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((strength == null) ? 0 : strength.hashCode());
		result = prime * result + ((weakness == null) ? 0 : weakness.hashCode());
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
		Associate other = (Associate) obj;
		if (associateID != other.associateID)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (level != other.level)
			return false;
		if (mobile != other.mobile)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pic == null) {
			if (other.pic != null)
				return false;
		} else if (!pic.equals(other.pic))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (strength == null) {
			if (other.strength != null)
				return false;
		} else if (!strength.equals(other.strength))
			return false;
		if (weakness == null) {
			if (other.weakness != null)
				return false;
		} else if (!weakness.equals(other.weakness))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Associate [associateID=" + associateID + ", name=" + name + ", email=" + email + ", mobile=" + mobile
				+ ", pic=" + pic + ", status=" + status + ", level=" + level + ", remark=" + remark + ", strength="
				+ strength + ", weakness=" + weakness + "]";
	}
	

}
