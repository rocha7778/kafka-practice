package com.rocha.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.rocha.app.entity.Product;
import com.rocha.app.repository.ProductRepository;

@ExtendWith(MockitoExtension.class)
public class ProductQueryServiceTest {

	@InjectMocks
	private ProductQueryServiceImpl productQueryService;

	@Mock
	private ProductRepository productRepository;

	@BeforeEach
	public void setUp() {
		System.out.println("setUp");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("tear down");

	}

	@Test
	public void testNotNull() {
		assertEquals(0, 0);
	}

	@Test
	public void getListOfProducts() {
		when(productRepository.getProducts()).thenReturn(getProducts());
		List<Product> list = productQueryService.getProducts();
		assertNotNull(list);
	}

	public List<Product> getProducts() {
		ArrayList<Product> listProduct = new ArrayList<>();
		Product p1 = new Product(1L, "Chair", "Beatiful", 100.0,0);
		listProduct.add(p1);
		return listProduct;
	}

}
