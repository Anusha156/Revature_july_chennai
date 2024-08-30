package com.revonlineshop.utility;

import com.revonlineshop.dao.CustomerDAO;
import com.revonlineshop.dao.CustomerDAOInterface;

public class DaoFactory {

	public static CustomerDAOInterface getObject(String string) {
		if(string.equals("customer")) {
			return new CustomerDAO();
		}
		return new CustomerDAO();
	}

}
