package com.hcl.mortgajedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mortgajedemo.entity.PinCodeDetails;
import com.hcl.mortgajedemo.repository.PinCodeDetailsRepository;

@Service
public class PinCodeService {

	@Autowired PinCodeDetailsRepository pinrepo;
	
	
	  public PinCodeDetails getValue(String pin) {
	  
	  return pinrepo.findByPincode(pin); 
	  }
	 
	  

	
}
