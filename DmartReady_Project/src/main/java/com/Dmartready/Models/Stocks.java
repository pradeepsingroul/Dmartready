package com.Dmartready.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Stocks {

	@Id
	private Integer stockID;
	
	private String name;
	
	private String description;
	
	private Integer quantity;
	
}
