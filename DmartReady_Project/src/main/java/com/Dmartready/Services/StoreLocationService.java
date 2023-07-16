package com.Dmartready.Services;

import java.util.List;

import com.Dmartready.Exceptions.Store_Location_Exception;
import com.Dmartready.Models.StoreLocation;

public interface StoreLocationService {
	
	public List<StoreLocation> findByName(String name) throws Store_Location_Exception;
	
	public List<StoreLocation> findByAddress(String address) throws Store_Location_Exception;

	public StoreLocation addStoreLocation(StoreLocation storeLocation) throws Store_Location_Exception;

	List<StoreLocation> getAllLocation() throws Store_Location_Exception;

}
