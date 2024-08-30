package com.onlineshop.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.revonlineshop.entity.Customer;
import com.revonlineshop.entity.Product;
import com.revonlineshop.service.CustomerServiceInterface;
import com.revonlineshop.utility.ServiceFactory;

public class CustomerServiceTest {
private CustomerServiceInterface cService;
	@Before
	public void setUp() throws Exception {
		cService=ServiceFactory.getObject("customer");
	}

	@After
	public void tearDown() throws Exception {
		cService=null;
	}

	@Test
	public void testAddCustomerService() {
		Customer c=new Customer();
		c.setName("anuradha");
		c.setAddress("kadapa");
		c.setGender("Female");
		c.setMobile("7702379727");
		c.setPassword("abcd");
		c.setPincode("515474");
		c.setEmail("anuradha@gmail.com");
		int i=cService.addCustomerService(c);
		
		assert i>0:"Customer Registration";
		
	}

	@Test
	public void testAddProductService() {
		Product p=new Product();
		p.setId(123);
		p.setImage_name("Perfume");
		p.setMrp_price("1900");
		p.setPrice("800");
		p.setName("Fogg");
		int j=cService.addProductService(p);
		
		assert j>0:"Product added Successfully";
		
	}

	@Test
	public void testAddtoCartService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testAddOrderService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testDeleteFromCartService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testFindMaxOrderService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testFindTotalProductService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testUpdateOrderStatusService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testUpdateProductService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testAdminLoginService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testCustomerLoginService() {
		System.out.println("Not yet implemented");
	}

}
