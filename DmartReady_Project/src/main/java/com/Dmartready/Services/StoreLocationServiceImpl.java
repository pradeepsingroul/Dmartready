package com.Dmartready.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dmartready.Exceptions.Store_Location_Exception;
import com.Dmartready.Models.StoreLocation;
import com.Dmartready.Repository.StoreLocationRepository;

@Service
public class StoreLocationServiceImpl implements StoreLocationService{
	
	@Autowired
	private StoreLocationRepository storeRepo;

	@Override
	public List<StoreLocation> findByName(String name) throws Store_Location_Exception {
		// TODO Auto-generated method stub
		List<StoreLocation> listOfStoreLcation = storeRepo.findAllByName(name);
		if(listOfStoreLcation.isEmpty()) {
			throw new Store_Location_Exception("Locations does not exist...");
		}else {
			return listOfStoreLcation;
		}
		
		 
	}
	@Override
	public List<StoreLocation> getAllLocation() throws Store_Location_Exception {
		// TODO Auto-generated method stub
		List<StoreLocation> listOfStoreLcation = storeRepo.findAll();
		if(listOfStoreLcation.isEmpty()) {
			throw new Store_Location_Exception("Locations does not exist...");
		}else {
			return listOfStoreLcation;
		}
		
		 
	}

	@Override
	public List<StoreLocation> findByAddress(String address) throws Store_Location_Exception {
		List<StoreLocation> listOfStoreLcation = storeRepo.findAllByAddress(address);
		if(listOfStoreLcation.isEmpty()) {
			throw new Store_Location_Exception("Locations does not exist...");
		}else {
			return listOfStoreLcation;
		}
	}

	@Override
	public StoreLocation addStoreLocation(StoreLocation storeLocation) throws Store_Location_Exception {
		Optional<StoreLocation> opt = storeRepo.findById(storeLocation.getLocationId());
		if(opt.isPresent()) {
			throw new Store_Location_Exception("Store location already exist...");
		}else {
			storeRepo.save(storeLocation);
			return storeLocation;
		}
	}

}
