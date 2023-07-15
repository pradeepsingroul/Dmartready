package com.Dmartready.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Dmartready.Exceptions.Store_Location_Exception;
import com.Dmartready.Models.StoreLocation;

@Repository
public interface StoreLocationRepository extends JpaRepository<StoreLocation, Integer>{

	
	
}
