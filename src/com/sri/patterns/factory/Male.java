package com.sri.patterns.factory;

public class Male implements Person {

	@Override
	public void wishMsg(String msg) {
		System.out.println("Hello Mr, " + msg);
	}

}
