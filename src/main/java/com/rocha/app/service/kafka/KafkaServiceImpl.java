package com.rocha.app.service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.rocha.app.dto.ProductDto;
import com.rocha.app.dto.ProductEvent;
import com.rocha.app.repository.ProductRepository;

@Service
@ConditionalOnProperty(name="service.mock", havingValue="false")
public class KafkaServiceImpl implements KafkaService {

	@Autowired
	private ProductRepository productRepository;
	
	
	@KafkaListener(topics = "product-event-topic", groupId = "product-event-gropu")
	@Override
	public void processProductEvent(ProductEvent productEvent) {
		switch (productEvent.getEvenType()) {
		case "CreatedProduct" -> createProduct(productEvent.getProduct());
		case "UpdatedProduct" -> updatePRoduct(productEvent.getProduct());
		default -> throw new IllegalArgumentException("Unexpected value: " + productEvent.getEvenType());

		}
	}

	private void createProduct(ProductDto product) {
		productRepository.createProduct(product);
	}
	
	private void updatePRoduct(ProductDto product) {
		productRepository.updateProduct(product);
	}

}
