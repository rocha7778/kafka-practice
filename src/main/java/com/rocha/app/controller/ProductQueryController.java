package com.rocha.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocha.app.dto.ProductDto;
import com.rocha.app.service.ProductQueryService;
import com.rocha.app.util.MapperUtil;

@RestController
@RequestMapping("/products")
public class ProductQueryController {
	
	@Autowired
	private ProductQueryService productQuery;
	
	@GetMapping
	public List<ProductDto> getproduct(){
		return productQuery.getProducts().stream().map(p ->  MapperUtil.mapperDaoToDto(p)).toList();
	}

}
