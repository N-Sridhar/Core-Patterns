package com.sri.patterns.factory;

public class PersonFactory {
	public static Person createPerson(String type) {
		Person p = null;

		if (type.equals("male")) {
			p = new Male();
		} else {
			p = new Female();
		}

		return p;
	}
}
