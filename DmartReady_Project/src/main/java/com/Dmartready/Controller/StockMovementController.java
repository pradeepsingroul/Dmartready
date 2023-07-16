package com.Dmartready.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dmartready.Models.StockMovement;
import com.Dmartready.Models.Stocks;
import com.Dmartready.Services.StockMovementService;

@RestController
@RequestMapping("/stockMovements")
public class StockMovementController {
	
	@Autowired
	private StockMovementService stMovementService;
	
	
	@GetMapping("")
	public ResponseEntity<List<StockMovement>> getAllStockMovements(@RequestBody Stocks stock){
		
		List<StockMovement> stMovements = stMovementService.getByStock(stock);
		return new ResponseEntity<List<StockMovement>>(stMovements,HttpStatus.OK);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<StockMovement> addNewStockMovement(@RequestBody StockMovement stovkMovement){
		
		StockMovement stMovement = stMovementService.addNewStockMovement(stovkMovement);
		return new ResponseEntity<StockMovement>(stMovement,HttpStatus.OK);
		
	}

}
