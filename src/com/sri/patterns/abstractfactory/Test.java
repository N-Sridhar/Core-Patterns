package com.sri.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {

		DAOAbstractFactory daf = DAOFactoryProducer.produce("db");
		DAO dao = daf.createDAO("emp");
		dao.save();
	}

}
