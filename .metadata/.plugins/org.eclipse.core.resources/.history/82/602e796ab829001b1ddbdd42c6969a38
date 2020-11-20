package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.LBO_repo;
import com.example.demo.model.Location_Based_Offers;

import java.util.*;

@RestController
public class LBO_Controller {

@Autowired
private LBO_repo repo;

@GetMapping("/offers")
public List<Location_Based_Offers> getOffers() {
	
	
	return repo.findAll();

	
	
}

}
