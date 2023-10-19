package com.rocha.app.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.rocha.app.entity.Product;
import com.rocha.app.repository.ProductRepository;

@SpringBootTest
public class ProductQueryServiceTestSpringBoot {

	@Mock
	private ProductRepository productRepository;

	@InjectMocks // auto inject productRepository
	private ProductQueryServiceImpl productQueryService = new ProductQueryServiceImpl();

	@BeforeEach
	void setMockOutput() {
		when(productRepository.getProducts()).thenReturn(getProducts());
	}

	public List<Product> getProducts() {
		ArrayList<Product> listProduct = new ArrayList<>();
		Product p1 = new Product(1L, "Chair", "Beatiful", 100.0,0);
		listProduct.add(p1);
		return listProduct;
	}

	@DisplayName("Test Mock helloService + helloRepository")
	@Test
	void testGet() {
		List<Product> list = productQueryService.getProducts();
		assertNotNull(list);
	}

}
