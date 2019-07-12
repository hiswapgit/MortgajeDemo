package com.hcl.mortgajedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.mortgajedemo.entity.LoanOffers;
import com.hcl.mortgajedemo.repository.LoanOffersRepository;

@Service
public class LoanOfferService {

	@Autowired LoanOffersRepository loanrepo;
	

	  List<LoanOffers>findByLoanAmount(double loanamount)
	  {
		 return loanrepo.findByLoanAmount(loanamount);
		  
	  }
			  
	
}
