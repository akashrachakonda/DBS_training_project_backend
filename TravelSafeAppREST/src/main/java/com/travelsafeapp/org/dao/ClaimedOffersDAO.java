package com.travelsafeapp.org.dao;


import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travelsafeapp.org.model.ClaimedOffers;

@Repository
public interface ClaimedOffersDAO extends JpaRepository<ClaimedOffers,Integer>{

	List<ClaimedOffers> findByCustomerId(String customerId);


}
