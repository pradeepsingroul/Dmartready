package com.Dmartready.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dmartready.Exceptions.Stock_Movement_Exception;
import com.Dmartready.Models.StockMovement;
import com.Dmartready.Models.Stocks;
import com.Dmartready.Repository.StockMovementRepository;

@Service
public class StockMovementServiceImpl implements StockMovementService{

	@Autowired
	private StockMovementRepository stockMovementRepo;
	
	@Override
	public List<StockMovement> getByStock(Stocks stock) throws Stock_Movement_Exception {
		// TODO Auto-generated method stub
		List<StockMovement> stMovements = stockMovementRepo.findByStock(stock);
		if(stMovements.isEmpty()) {
			throw new Stock_Movement_Exception("Stock movement does not exits...");
		}else {
			return stMovements;
		}
	}
	

}
