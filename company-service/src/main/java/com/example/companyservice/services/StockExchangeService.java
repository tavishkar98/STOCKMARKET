package com.example.companyservice.services;

import java.util.List;

import com.example.companyservice.dtos.StockExchangeDTO;

public interface StockExchangeService {

	public StockExchangeDTO createStockExchange(StockExchangeDTO stockExchangeDTO);
    public List<StockExchangeDTO> findAllStockExchanges();
    public StockExchangeDTO findStockExchangeByName(String name);
    public StockExchangeDTO findStockExchangeById(String id);
}
