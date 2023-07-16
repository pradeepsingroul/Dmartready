package com.Dmartready.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dmartready.Exceptions.Stock_Movement_Exception;
import com.Dmartready.Models.StockMovement;
import com.Dmartready.Models.Stocks;
import com.Dmartready.Repository.StockMovementRepository;
import com.Dmartready.Repository.StocksRepository;

@Service
public class StockMovementServiceImpl implements StockMovementService{

	@Autowired
	private StockMovementRepository stockMovementRepo;
	
	@Autowired
	private StocksRepository stocksRepository;
	
	
	@Override
	public List<StockMovement> getByStock(Stocks stock) throws Stock_Movement_Exception {
		// TODO Auto-generated method stub
		Optional<Stocks> stocks = stocksRepository.findById(stock.getStockID());
		
		if(stocks.isEmpty()) {
			throw new Stock_Movement_Exception("Stock movement does not exits...");
		}else {
			List<StockMovement> stMovements = stocks.get().getStockMovements();
			return stMovements;
		}
	}

	@Override
	public StockMovement addNewStockMovement(StockMovement stockMovement) throws Stock_Movement_Exception {
		Optional<StockMovement> opt = stockMovementRepo.findById(stockMovement.getMovementId());
		if(opt.isPresent()) {
			throw new Stock_Movement_Exception("Stock movement already register with the id :"+stockMovement.getMovementId());
		}else {
			StockMovement stm = stockMovementRepo.save(stockMovement);
			return stm;
		}
	}
	

}
