package com.rocha.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRODUCT_COMMAND")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Product {
	
	@Id
	@GeneratedValue
	private Long id;
    private String name;
    private String description;
    private double price;
    private double quantity;

}
