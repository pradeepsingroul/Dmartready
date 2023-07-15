package com.Dmartready.Models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockLocation {

	private Integer Location_id;
	
	private String name;
	
	private String address;
	
	
	
}
