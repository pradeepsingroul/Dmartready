package com.Dmartready.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Dmartready.Models.Stocks;
import com.Dmartready.Services.StocksService;

@RestController
@RequestMapping("/stocks")
public class StockController {

	
	@Autowired
	private StocksService stockService;
	
	
	@GetMapping("")
	public ResponseEntity<List<Stocks>> getAllStocksController(){
		
		List<Stocks> listOfStock = stockService.getAllStocks();
		return new ResponseEntity<List<Stocks>>(listOfStock,HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Stocks> addStocksInSystem(@RequestBody Stocks  s){
		
		Stocks stock = stockService.addStock(s);
		return new ResponseEntity<Stocks>(stock,HttpStatus.OK);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Stocks>> findByNameController(@RequestParam(name = "Name") String  name){
		
		List<Stocks> stock = stockService.findByNameService(name);
		return new ResponseEntity<List<Stocks>>(stock,HttpStatus.OK);
		
	}
	
	@GetMapping("/update")
	public ResponseEntity<Stocks> updateQuantity(@RequestParam(name = "id")int id, @RequestParam(name = "quantity")int quantity){
		
		Stocks stock = stockService.updateQuantityById(id, quantity);
		return new ResponseEntity<Stocks>(stock,HttpStatus.OK);
		
	}
	
	@GetMapping("/greater")
	public ResponseEntity<List<Stocks>> findBYQuantityGreater(@RequestParam(name = "quantity")int quantity){
		
		List<Stocks> stock = stockService.findByQuantityGreater(quantity);
		return new ResponseEntity<List<Stocks>>(stock,HttpStatus.OK);
		
	}
	
	@GetMapping("/delete")
	public ResponseEntity<Stocks> deleteById(@RequestParam(name = "id")int id){
		
		Stocks stock = stockService.deleteById(id);
		return new ResponseEntity<Stocks>(stock,HttpStatus.OK);
		
	}
	
	
}
