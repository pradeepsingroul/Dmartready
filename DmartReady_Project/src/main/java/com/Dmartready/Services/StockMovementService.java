package com.Dmartready.Services;

import java.util.List;

import com.Dmartready.Exceptions.Stock_Movement_Exception;
import com.Dmartready.Models.StockMovement;
import com.Dmartready.Models.Stocks;
//import com.Dmartready.Models.Integer;

public interface StockMovementService {
	
	public List<StockMovement> getByStock(Stocks stock) throws Stock_Movement_Exception;
	
	public StockMovement addNewStockMovement(StockMovement stockMovement) throws Stock_Movement_Exception;

}
