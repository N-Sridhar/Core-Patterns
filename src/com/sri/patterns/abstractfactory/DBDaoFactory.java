package com.sri.patterns.abstractfactory;

public class DBDaoFactory extends DAOAbstractFactory {

	@Override
	public DAO createDAO(String type) {

		DAO Dao = null;

		if (type.equals("emp")) {
			Dao = new DBEmpDAO();
		} else if (type.equals("dept")) {
			Dao = new DBDeptDAO();
		}

		return Dao;
	}

}
