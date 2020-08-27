package com.example.companyservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.companyservice.models.StockExchange;

@Repository
public interface StockExchangeRepo extends JpaRepository<StockExchange,String> {
	
	public StockExchange findByName(String name);

}
