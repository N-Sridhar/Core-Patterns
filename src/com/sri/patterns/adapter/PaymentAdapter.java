package com.sri.patterns.adapter;

public class PaymentAdapter {

	public double pay(int rupees) {
		PaymentProcessor process = new PaymentProcessorImpl();
		double dollars = (double) rupees / 73;
		return process.pay(dollars);
	}
}
