package com.Dmartready.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dmartready.Exceptions.Stock_Exceptions;
import com.Dmartready.Models.Stocks;
import com.Dmartready.Repository.StocksRepository;

@Service
public class StockServiceImpl implements StocksService {

	@Autowired
	private StocksRepository stockRepo;
	
	
	@Override
	public Stocks findByNameService(String name) throws Stock_Exceptions {
		// TODO Auto-generated method stub
		Stocks stock = stockRepo.findByName(name);
		return stock;
	}

	@Override
	public Stocks updateQuantityById(int id, int quantity) throws Stock_Exceptions {
		Optional<Stocks> opt = stockRepo.findById(id);
		if(opt.isPresent()) {
			Stocks stocks = opt.get();
			stocks.setQuantity(stocks.getQuantity()+(quantity));
			stockRepo.save(stocks);
			return stocks;
		}else {
			throw new Stock_Exceptions("Stock item does not exist with the id :"+id);
		}
	
	}

	@Override
	public List<Stocks> findByQuantityGreater(int quantity) throws Stock_Exceptions {
		// TODO Auto-generated method stub
		List<Stocks> stockList = stockRepo.findStocksByQuantity(quantity);
		if(stockList.isEmpty()) throw new Stock_Exceptions("there is nothing in the system whose quantity is greater than :"+quantity);
		else return stockList;
	}

	@Override
	public Stocks deleteById(int id) throws Stock_Exceptions {
		// TODO Auto-generated method stub
		Optional<Stocks> opt = stockRepo.findById(id);
		if(opt.isPresent()) {
			stockRepo.deleteById(id);
			return opt.get();
		}else {
			throw new Stock_Exceptions("stock item does not exist with id :"+id);
		}
	}

	@Override
	public List<Stocks> getAllStocks() throws Stock_Exceptions {
		// TODO Auto-generated method stub
		List<Stocks> stocks = stockRepo.findAll();
		if(stocks.isEmpty()) {
			throw new Stock_Exceptions("Stocks does not exist...");
		}else {
			return stocks;
		}
		
	}

	@Override
	public Stocks addStock(Stocks stocks) throws Stock_Exceptions {
		// TODO Auto-generated method stub
		Optional<Stocks> opt = stockRepo.findById(stocks.getStockID());
		if(opt.isEmpty()) {
			stockRepo.save(stocks);
			return stocks;
		}
		else throw new Stock_Exceptions("Stock already exist with id :"+stocks.getStockID());
	}

}
