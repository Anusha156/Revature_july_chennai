package com.linkedin;

import static org.junit.Assert.*;

import org.apache.log4j.chainsaw.Main;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.linkedin.DAO.LinkedinDAO;
import com.linkedin.DAO.LinkedinDAOInterface;
import com.linkedin.entity.LinkedinUser;

public class LinkedinDAOTest {
	
	private LinkedinDAOInterface Idao;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Idao = new LinkedinDAO();
	}

	@After
	public void tearDown() throws Exception {
		Idao=null;
	}

	@Test
	public void testCreateProfileDAO() {
		LinkedinUser lu=new LinkedinUser();
		lu.setName("siva");
		lu.setPassword("siva");
		lu.setMail("siva@gmail.com");
		
		int i=Idao.createProfileDAO(lu);
		
		assert i>0 : "profile not created";
	}

	@Test
	public void testViewProfileDAO() {
	    System.out.println("Not yet implemented");
	}

	@Test
	public void testViewAllProfileDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testEditProfileDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testDeleteProfileDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testLoginProfileDAO() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testSearchProfileDAO() {
		System.out.println("Not yet implemented");
	}

}
