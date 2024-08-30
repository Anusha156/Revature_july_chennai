package com.revonlineshop.utility;

import com.revonlineshop.service.CustomerService;
import com.revonlineshop.service.CustomerServiceInterface;

public class ServiceFactory {

	public static CustomerServiceInterface getObject(String string) {
		if (string.equals("customer")) {
			return new CustomerService();

		}
		return new CustomerService();
	}
}
