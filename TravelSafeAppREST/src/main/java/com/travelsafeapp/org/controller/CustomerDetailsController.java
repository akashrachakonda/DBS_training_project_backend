package com.travelsafeapp.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.travelsafeapp.org.dao.CustomerDetailsRepo;
import com.travelsafeapp.org.model.CustomerDetails;


@RestController
public class CustomerDetailsController {

	@Autowired
	private CustomerDetailsRepo repo;
	
	@GetMapping("/customerDetails")
	public List<CustomerDetails> allDetails(){
		return repo.findAll();
		
	}
	
	@GetMapping("/customerDetails/{customerId}")
	public List<CustomerDetails> customerDetails(@PathVariable String customerId){
		return repo.findByCustomerId(customerId);
		
	}
	
	
	
}
