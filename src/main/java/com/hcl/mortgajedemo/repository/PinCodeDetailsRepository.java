package com.hcl.mortgajedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.mortgajedemo.entity.PinCodeDetails;


@Repository
public interface PinCodeDetailsRepository extends JpaRepository<PinCodeDetails, Long>{
	/**
	 * 
	 * get pincodedeatils object
	 * 
	 *
	 */
	public PinCodeDetails findByPincode(String pin);

}
