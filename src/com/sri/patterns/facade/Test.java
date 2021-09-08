package com.sri.patterns.facade;

public class Test {

	public static void main(String[] args) {
		OrderFacade facade = new OrderFacade();
		facade.orderProcessor("MackBook", 3);
	}

}
