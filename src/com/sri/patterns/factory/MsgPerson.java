package com.sri.patterns.factory;

public class MsgPerson {

	public Person getPerson(String type) {
		Person p = PersonFactory.createPerson("male");
		p.wishMsg("Have a great day!");
		return p;
	}
}