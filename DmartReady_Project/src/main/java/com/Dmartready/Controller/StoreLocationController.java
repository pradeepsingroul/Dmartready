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
import com.Dmartready.Models.StoreLocation;
import com.Dmartready.Services.StoreLocationService;

@RestController
@RequestMapping("/storeLocations")
public class StoreLocationController {
	
	
	@Autowired
	private StoreLocationService storeService;
	
	@GetMapping("")
	public ResponseEntity<List<StoreLocation>> getAllLocation(){
		
		List<StoreLocation> storeLocations = storeService.getAllLocation();
		return new ResponseEntity<List<StoreLocation>>(storeLocations,HttpStatus.OK);
		
	}
	
	@PostMapping("")
	public ResponseEntity<StoreLocation> addNewLocation(@RequestBody StoreLocation storeLocation){
		StoreLocation storeLocation2 = storeService.addStoreLocation(storeLocation);
		return new ResponseEntity<StoreLocation>(storeLocation2,HttpStatus.OK);
		
	}
	
	@GetMapping("/getByName")
	public ResponseEntity<List<StoreLocation>> getByName(@RequestParam(name = "name") String name){
		List<StoreLocation> storeLocations = storeService.findByName(name);
		return new ResponseEntity<List<StoreLocation>>(storeLocations,HttpStatus.OK);
		
	}
	
	@GetMapping("/getByAddress")
	public ResponseEntity<List<StoreLocation>> getByAddress(@RequestParam(name = "address") String address){
		List<StoreLocation> storeLocations = storeService.findByAddress(address);
		return new ResponseEntity<List<StoreLocation>>(storeLocations,HttpStatus.OK);
		
	}

}
