package com.Dmartready.Services;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Dmartready.Exceptions.Stock_Exceptions;
import com.Dmartready.Models.Stocks;

@Component
public interface StocksService {
	
	public Stocks addStock(Stocks stocks) throws Stock_Exceptions;
	
	public List<Stocks> findByNameService(String name) throws Stock_Exceptions;
	
	public Stocks updateQuantityById(int id, int quantity) throws Stock_Exceptions;
	
	public List<Stocks> findByQuantityGreater(int quantity) throws Stock_Exceptions;
	
	public Stocks deleteById(int id) throws Stock_Exceptions;

	public List<Stocks> getAllStocks() throws Stock_Exceptions;
	
	
}
