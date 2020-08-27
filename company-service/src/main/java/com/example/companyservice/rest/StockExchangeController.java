package com.example.companyservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.companyservice.dtos.StockExchangeDTO;
import com.example.companyservice.services.StockExchangeService;
public class StockExchangeController {

	@Autowired
	private StockExchangeService stockExchangeService;

    @GetMapping("/test")
    public String test() {
        return "stock exchange service is working";
    }

    @GetMapping("/all")
    public ResponseEntity<List> getAllStockExchanges() {
        List<StockExchangeDTO> list = stockExchangeService.findAllStockExchanges();
        return ResponseEntity.status(HttpStatus.FOUND).body(list);
    }

    @PostMapping("/addStockExchange")
    public ResponseEntity<StockExchangeDTO> addStockExchange(@RequestBody StockExchangeDTO stockExchangeDTO) {
        StockExchangeDTO stockExchangeDTO1 = stockExchangeService.createStockExchange(stockExchangeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(stockExchangeDTO1);
    }

    @GetMapping("/{name}")
    public ResponseEntity<StockExchangeDTO> getStockExchangeByName(@PathVariable String name) {
        StockExchangeDTO stockExchangeDTO = stockExchangeService.findStockExchangeByName(name);
        return ResponseEntity.status(HttpStatus.FOUND).body(stockExchangeDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StockExchangeDTO> getStockExchangeById(@PathVariable String id) {
        StockExchangeDTO stockExchangeDTO = stockExchangeService.findStockExchangeById(id);
        return ResponseEntity.status(HttpStatus.FOUND).body(stockExchangeDTO);
    }
}
