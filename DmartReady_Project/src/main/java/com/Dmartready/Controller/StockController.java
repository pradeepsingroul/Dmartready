package com.Dmartready.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dmartready.Models.Stocks;
import com.Dmartready.Services.StocksService;

@RestController
@RequestMapping("/stocks")
public class StockController {

	
	@Autowired
	private StocksService stockService;
	
	
	@GetMapping("/")
	public ResponseEntity<List<Stocks>> getAllStocksController(){
		
		List<Stocks> listOfStock = stockService.getAllStocks();
		return new ResponseEntity<List<Stocks>>(listOfStock,HttpStatus.OK);
		
	}
	
	@GetMapping("/add")
	public ResponseEntity<Stocks> addStocksInSystem(@RequestBody Stocks  s){
		
		Stocks stock = stockService.addStock(s);
		return new ResponseEntity<Stocks>(stock,HttpStatus.OK);
		
	}
	
	
	
}
