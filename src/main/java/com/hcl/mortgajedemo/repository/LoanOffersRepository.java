package com.hcl.mortgajedemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.mortgajedemo.entity.LoanOffers;

@Repository
public interface LoanOffersRepository extends JpaRepository<LoanOffers, Long>{

	
	/**
	 * This JPA method used to get loan amount is > then passed value
	 * @Query is used to write Nativequery
	 * 
	 *
	 */
	@Query(value="select * from loan_offer_details where loan_amount <= :loanamount",nativeQuery = true)
	List<LoanOffers>findByLoanAmount(double loanamount);
	
}
