package com.sri.patterns.facade;

public class OrderFacade {

	OrderProcessor processor = new OrderProcessor();

	public void orderProcessor(String name, int quantity) {
		if (processor.checkStock(name)) {
			String orderId = processor.placeOrder(name, quantity);
			processor.shipOrder(orderId);
		}
	}
}
