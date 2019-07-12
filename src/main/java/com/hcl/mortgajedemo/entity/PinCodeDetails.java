package com.hcl.mortgajedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pin_code_details")
public class PinCodeDetails {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="pin_code")
	private String pincode;

	
	@Column(name="squer_feet_value")
	private Double squerfeetvalue;

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getSquerfeetvalue() {
		return squerfeetvalue;
	}

	public void setSquerfeetvalue(Double squerfeetvalue) {
		this.squerfeetvalue = squerfeetvalue;
	}

	
	
	

}
