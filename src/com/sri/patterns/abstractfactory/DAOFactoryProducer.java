package com.sri.patterns.abstractfactory;

public class DAOFactoryProducer {

	public static DAOAbstractFactory produce(String factoryType) {
		DAOAbstractFactory daf = null;

		if (factoryType.equals("xml")) {
			daf = new XMLDaoFactory();
		} else if (factoryType.equals("db")) {
			daf = new DBDaoFactory();
		}

		return daf;
	}
}
