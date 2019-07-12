package com.hcl.mortgajedemo.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hcl.mortgajedemo.dto.UserDto;
import com.hcl.mortgajedemo.entity.PinCodeDetails;
import com.hcl.mortgajedemo.entity.UserDetails;
import com.hcl.mortgajedemo.repository.UserRepository;

@Service
public class UserService {

	@Autowired UserRepository userrepo;
	
	@Autowired PinCodeService pinservice;
	
	@Autowired LoanOfferService loanservice;
	
	/**
	 * This method used to addd user with validation like age>25,salary>10000,property value>500000
	 * POJO is mapped with Entity with using Dto
	 * return list of offer 
	 *
	 */
	
	public ResponseEntity<Object> addUser(UserDto userdto)
	{
		int age=Period.between(userdto.getDobdto(), LocalDate.now()).getYears();
		
		 String pin=userdto.getPincodedto();
		  
		  PinCodeDetails pincode= pinservice.getValue(pin);
		  
		  Double value=pincode.getSquerfeetvalue();
		  Long size=userdto.getAreasizedto();
		  
		  Long propertyValue=(long) (value*size);
		
		if(age >= 25&& userdto.getSalarydto()>=10000&&propertyValue>=500000)
		{
			
			
			
			UserDetails user=new UserDetails();
			user.setAreasize(userdto.getAreasizedto());
			user.setDob(userdto.getDobdto());
			user.setGender(userdto.getGenderdto());
			user.setMail(userdto.getMaildto());
			user.setName(userdto.getUsernamedto());
			user.setPanno(userdto.getPannodto());
			user.setPhoneno(userdto.getPhnodto());
			user.setPincode(userdto.getPincodedto());
			user.setPropertyaddress(userdto.getPropertyaddressdto());
			user.setPropertytype(userdto.getPropertytypedto());
			user.setSalary(userdto.getSalarydto());
			
			userrepo.save(user);					
			return new ResponseEntity<>(loanservice.findByLoanAmount(propertyValue*0.8),HttpStatus.OK);
		}
		
		
		else
		{
			
			 return new ResponseEntity<>("Fail try again",HttpStatus.OK);
		}
			
	}

	
	
	
	
	
	public Optional<UserDetails> getEmployeeById(Long id) {
		
		return userrepo.findById(id);
	}
	
}
