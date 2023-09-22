package com.rocha.app.service.kafka;

import com.rocha.app.dto.ProductEvent;

public interface KafkaService {
	
	public void processProductEvent(ProductEvent productEvent);

}
