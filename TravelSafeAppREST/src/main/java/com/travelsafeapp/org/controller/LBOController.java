package com.travelsafeapp.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.travelsafeapp.org.dao.LBORepo;
import com.travelsafeapp.org.model.LocationBasedOffers;
import java.util.*;


@RestController
public class LBOController {
	
	@Autowired
	private LBORepo repo;
	
	
	
	@GetMapping("/offers/{category}/{country}")
	public List<LocationBasedOffers> getOffers(@PathVariable String category,@PathVariable String country) {
		if(category.equals("all")) {
		return repo.findByCountryCode(country);
		}

	return repo.findByOfferCategoryAndCountryCode(category,country);
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	

}
