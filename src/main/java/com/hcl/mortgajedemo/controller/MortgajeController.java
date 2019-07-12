package com.hcl.mortgajedemo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.mortgajedemo.dto.UserDto;
import com.hcl.mortgajedemo.entity.UserDetails;
import com.hcl.mortgajedemo.service.PinCodeService;
import com.hcl.mortgajedemo.service.UserService;

@RestController
@RequestMapping("/offer")
public class MortgajeController 
{

	
	@Autowired PinCodeService pinservice;
	
	@Autowired UserService userservice;
	
	
	
	
	@GetMapping("/{id}")
	public Optional<UserDetails> getEmployeeById(@PathVariable Long id){
		return userservice.getEmployeeById(id);
	}
	
	
	@PostMapping("/adduser")
	public ResponseEntity<Object> addUser(@RequestBody UserDto user){
		
		
		if(null!=user)
		{
			
			
			return new ResponseEntity<>(userservice.addUser(user),HttpStatus.OK);
	    }
		
		else
		{
	        return new ResponseEntity<>("Fail try again",HttpStatus.OK);
		
	}
		  
}
}