package com.sri.patterns.abstractfactory;

public class XMLDaoFactory extends DAOAbstractFactory {

	@Override
	public DAO createDAO(String type) {
		
		DAO Dao = null;
		
		if (type.equals("emp")) {
			Dao = new XMLEmpDAO();
		} else if (type.equals("dept")) {
			Dao = new XMLDeptDAO();
		}
		
		return Dao;
	}

}
