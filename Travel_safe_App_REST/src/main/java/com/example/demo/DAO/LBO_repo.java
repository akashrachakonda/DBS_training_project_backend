package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Location_Based_Offers;
import java.util.Optional;


public interface LBO_repo extends JpaRepository<Location_Based_Offers,Integer>{

//	@Query("FROM lbo4 WHERE offerCategory = ?1 && countryCode  = ?2")
//	List<Location_Based_Offers> findByOfferCategoryAndCountry( String offerCategory, String countryCode);

	
	//List<Location_Based_Offers> findByCountryCode(Optional<String> country);
	

}
