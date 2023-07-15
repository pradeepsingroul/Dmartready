package com.Dmartready.Models;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class StockMovement {

	@Id
	private Integer movementId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stock_item_id")
	private Stocks stockId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "store_location_id")
	private StoreLocation storeLocation_Id;
	
	private Integer quantity;
	
	private LocalDateTime timeStamp;
	
}
