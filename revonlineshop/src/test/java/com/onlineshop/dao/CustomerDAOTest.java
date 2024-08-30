package com.onlineshop.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.revonlineshop.dao.CustomerDAOInterface;
import com.revonlineshop.entity.Customer;
import com.revonlineshop.entity.Product;
import com.revonlineshop.utility.DaoFactory;

public class CustomerDAOTest {
private CustomerDAOInterface cDAO;
	@Before
	public void setUp() throws Exception {
		cDAO=DaoFactory.getObject("customer");
	}

	@After
	public void tearDown() throws Exception {
		cDAO=null;
	}

	@Test
	public void testAddCustomerDAO() {
		Customer c=new Customer();
		c.setName("anuradha");
		c.setAddress("kadapa");
		c.setGender("Female");
		c.setMobile("7702379727");
		c.setPassword("abcd");
		c.setPincode("515474");
		c.setEmail("anuradha@gmail.com");
		int i=cDAO.addCustomerDAO(c);
		
		assert i>0:"Customer Registration System.out.println";
	}

	@Test
	public void testAddProductDAO() {
		Product p=new Product();
		p.setId(123);
		p.setImage_name("Perfume");
		p.setMrp_price("1900");
		p.setPrice("800");
		p.setName("Fogg");
		int j=cDAO.addProductDAO(p);
		
		assert j>0:"Product added Successfully";
		
	}

	@Test
	public void testAddtoCartDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testAddOrderDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testDeleteFromCartDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testFindMaxOrderDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testFindTotalProductDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testUpdateOrderStatusDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testUpdateProductDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testAdminLoginDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testCustomerLoginDAO() {
		System.out.println("Not yet implemented");
	}

}
