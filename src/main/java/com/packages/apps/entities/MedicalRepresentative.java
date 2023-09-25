package com.packages.apps.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity
@Table(name="medicalrepresentative")
public class MedicalRepresentative {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mrID;
	
	@Column(name="firstname", nullable = false)
	private String firstName;
	
	@Column(name="lastname", nullable = false)
	private String lastName;
	
	@Column(name="contact", nullable = false)
	private Double mrcontact;
	
	@Column(name="email", nullable = false)
	private String mremail;

	
	public MedicalRepresentative() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public MedicalRepresentative(String firstName, String lastName, Double mrcontact, String mremail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mrcontact = mrcontact;
		this.mremail = mremail;
	}

	public int getMrID() {
		return mrID;
	}

	public void setMrID(int mrID) {
		this.mrID = mrID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getMrcontact() {
		return mrcontact;
	}

	public void setMrcontact(Double mrcontact) {
		this.mrcontact = mrcontact;
	}

	public String getMremail() {
		return mremail;
	}

	public void setMremail(String mremail) {
		this.mremail = mremail;
	}
	
	
	
	
}
