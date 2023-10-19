package com.rocha.app.service.kafka;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import com.rocha.app.dto.ProductEvent;


@Service
@ConditionalOnProperty(name="service.mock", havingValue="true")
public class KafkaMockService implements KafkaService {
	
	
	public KafkaMockService() {
		System.out.println("Cargando kafka mock");
	}
	
	
	@Override
	public void processProductEvent(ProductEvent productEvent) {
		System.out.println("llamando serivicio mock");
	}

	

}
