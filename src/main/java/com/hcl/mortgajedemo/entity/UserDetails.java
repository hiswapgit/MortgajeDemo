package com.hcl.mortgajedemo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	

	@Column(name="property_type")
	private String propertytype;
	
	@Column(name="property_address")
	private String propertyaddress;
	
	
	@Column(name="area_size")
	private Long areasize;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="phone_no")
	private Long phoneno;
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name="salary")
	private Double salary;
	
	@Column(name="pan_no")
	private Double panno;
	
	@Column(name="pin_code")
	private String pincode;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="date_of_birth")
	private LocalDate dob;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getPropertytype() {
		return propertytype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}

	public void setPropertytype(String propertytype) {
		this.propertytype = propertytype;
	}

	public String getPropertyaddress() {
		return propertyaddress;
	}

	public void setPropertyaddress(String propertyaddress) {
		this.propertyaddress = propertyaddress;
	}

	public Long getAreasize() {
		return areasize;
	}

	public void setAreasize(Long areasize) {
		this.areasize = areasize;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Double getPanno() {
		return panno;
	}

	public void setPanno(Double panno) {
		this.panno = panno;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
		
}
