package com.Dmartready.Models;

import java.util.List;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
	
	@Column(name = "name", unique = true)
	private String name;
	
	private String description;
	
	private Integer quantity;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<StockMovement> stockMovements;
	
	
	
}
