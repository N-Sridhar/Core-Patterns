package com.sri.patterns.adapter;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public double pay(double dollers) {
		return dollers;
	}

}
