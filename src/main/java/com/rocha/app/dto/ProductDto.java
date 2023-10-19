package com.rocha.app.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto implements Serializable{
	private static final long serialVersionUID = -6064286412336322198L;
	private Long id;
    private String name;
    private String description;
    private double price;
    private Double quantity;

}
