package com.Dmartready.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Dmartready.Models.StockMovement;
import com.Dmartready.Models.Stocks;

@Repository
public interface StockMovementRepository extends JpaRepository<StockMovement, Integer>{

	List<StockMovement> findByStock(Stocks stock);
}
