package com.sri.patterns.adapter;

public class PaymentApp {

	public void pay(int rupees) {
		PaymentAdapter adapter = new PaymentAdapter();
		double paymentDone = adapter.pay(rupees);
		System.out.printf("%.3f", paymentDone);
	}

	public static void main(String[] args) {
		PaymentApp app = new PaymentApp();
		app.pay(3033);
	}

}
