package com.travelsafeapp.org.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelsafeapp.org.dao.ClaimedOffersDAO;
import com.travelsafeapp.org.model.ClaimedOffers;




@RestController
public class ClaimedOffersController {

	
	@Autowired
	private  ClaimedOffersDAO repo;

	

	@GetMapping("offers/claim/{customerId}")
	public List<ClaimedOffers> getClaimedOffers(@PathVariable String customerId) 
	{
		return repo.findByCustomerId(customerId);
	}
	
	
	@PostMapping(path="/offersAdd",consumes={"application/json"})
	public void addClaimedOffers(@RequestBody ClaimedOffers claimedOffersobj) {
		repo.save(claimedOffersobj);
		
	}
	

}






