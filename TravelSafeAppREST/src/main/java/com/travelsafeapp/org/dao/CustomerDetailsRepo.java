package com.travelsafeapp.org.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelsafeapp.org.model.CustomerDetails;

@Repository
public interface CustomerDetailsRepo extends JpaRepository<CustomerDetails,Integer> {

	@Query("from ctd4 where customer_id=?1")
	List<CustomerDetails> findByCustomerId(String customerId);

	
	
	
	
}
