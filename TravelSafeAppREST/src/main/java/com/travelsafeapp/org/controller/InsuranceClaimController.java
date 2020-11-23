package com.travelsafeapp.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelsafeapp.org.dao.InsuranceClaimRepo;
import com.travelsafeapp.org.model.InsuranceClaim;

@RestController
public class InsuranceClaimController {

	@Autowired
	InsuranceClaimRepo repo;
	
	
	@PostMapping(path="/addInsuranceClaim",consumes={"application/json"})
	public void addInsuranceClaim(@RequestBody InsuranceClaim claim) {
		
		repo.save(claim);
		
		
	}
	
	@GetMapping("/getInsuranceClaim/{customerId}")
	public List<InsuranceClaim> getInsuranceClaim(@PathVariable String customerId){
		
		return repo.findByCustomerId(customerId);
	}
	
 
}
