package com.hcl.mortgajedemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.mortgajedemo.entity.LoanOffers;

@Repository
public interface LoanOffersRepository extends JpaRepository<LoanOffers, Long>{

	@Query(value="select * from loan_offer_details where loan_amount <= :loanamount",nativeQuery = true)
	List<LoanOffers>findByLoanAmount(double loanamount);
	
}
