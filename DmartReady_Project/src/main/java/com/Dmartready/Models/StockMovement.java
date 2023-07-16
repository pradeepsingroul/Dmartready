package com.Dmartready.Models;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StockMovement {

	@Id
	private Integer movementId;
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private StoreLocation storeLocation;

	@ManyToOne(cascade = CascadeType.ALL)
	private Stocks stocks;
	
	private Integer quantity;
	
	private LocalDateTime timeStamp;
	
}
