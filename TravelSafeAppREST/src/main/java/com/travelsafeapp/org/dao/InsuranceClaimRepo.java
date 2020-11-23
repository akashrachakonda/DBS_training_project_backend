package com.travelsafeapp.org.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelsafeapp.org.model.InsuranceClaim;

public interface InsuranceClaimRepo extends JpaRepository<InsuranceClaim,Integer>{

	List<InsuranceClaim> findByCustomerId(String customerId);

}
