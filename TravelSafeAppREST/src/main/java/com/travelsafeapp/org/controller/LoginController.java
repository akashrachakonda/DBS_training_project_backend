package com.travelsafeapp.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.travelsafeapp.org.dao.CustomerDetailsRepo;
import com.travelsafeapp.org.model.CustomerDetails;



@RestController
public class LoginController {
	
	@Autowired
	private  CustomerDetailsRepo repo;
	
	@GetMapping("/authenticate/{customerId}")
	public boolean isAuthenticated(@PathVariable String customerId ) {
		
		List<CustomerDetails> customerRecords= repo.findByCustomerId(customerId);
		
		if(customerRecords.size()>0) {
			return true;
		}
		 
		 
		return false;
	}
	
	

}
