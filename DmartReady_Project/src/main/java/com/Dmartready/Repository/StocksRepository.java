package com.Dmartready.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Dmartready.Exceptions.Stock_Exceptions;
import com.Dmartready.Models.Stocks;

@Repository
public interface StocksRepository extends JpaRepository<Stocks, Integer>{
	
	public Stocks findByName(String name) throws Stock_Exceptions;
	
	@Query("from com.Dmartready.Models.Stocks s where s.quantity >= ?1")
	public List<Stocks> findStocksByQuantity(int quantity) throws Stock_Exceptions;
	
	

	
	
	
}
