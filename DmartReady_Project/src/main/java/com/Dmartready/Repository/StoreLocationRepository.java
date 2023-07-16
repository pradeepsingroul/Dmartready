package com.Dmartready.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Dmartready.Exceptions.Store_Location_Exception;
import com.Dmartready.Models.StoreLocation;

import jakarta.persistence.NamedQuery;

@Repository
public interface StoreLocationRepository extends JpaRepository<StoreLocation, Integer>{

	@Query("from StoreLocation s where s.name = ?1 order by s.name ASC")
	public List<StoreLocation> findAllByName(String name);
	
	@Query("from StoreLocation s where s.address = ?1 order by s.address ASC")
	public List<StoreLocation> findAllByAddress(String address);
	
}
