package com.rocha.app.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ProductQueryControllerTest {

	@Autowired
	private ProductQueryController controller;
	
	
	@Value(value="${local.server.port}")
	private int port;
	
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	
	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		System.out.println("http://localhost:" + port + "/products");
		
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/products", List.class)).isNotNull();
	}

}
