package com.hcl.mortgajedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_offer_details")
public class LoanOffers
{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="loan_amount")
	private Double loanamount;
	
	@Column(name="tenure")
	private Integer tenure;
	
	@Column(name="interest_rate")
	private Float interestrate;
	
	@Column(name="emi")
	private Double emi;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(Double loanamount) {
		this.loanamount = loanamount;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	

	public Float getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(Float interestrate) {
		this.interestrate = interestrate;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}
	
	
	
}
