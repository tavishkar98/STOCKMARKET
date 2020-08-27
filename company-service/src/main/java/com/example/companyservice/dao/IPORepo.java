package com.example.companyservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.companyservice.models.IPO;

@Repository
public interface IPORepo extends JpaRepository<IPO,String> {

}
