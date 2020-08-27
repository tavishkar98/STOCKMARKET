package com.example.companyservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.companyservice.models.Company;

@Repository
public interface CompanyRepo extends JpaRepository<Company, String>{

	public Company findByName(String name);
    public Company findByTicker(String ticker);
    public List<Company> findAllBySector(String sector);
//    public List<Company> findCompanyByTurnoverWithin(Long lo, Long hi);
    public List<Company> findAllByStockExchangeListContaining(String stockExchange);
}
