package com.sri.patterns.factory;

public class Female implements Person {

	@Override
	public void wishMsg(String msg) {
		System.out.println("Hello Ms, " + msg);
	}

}
