package com.linkedin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.linkedin.entity.LinkedinUser;
import com.linkedin.service.LinkedinServiceInterface;
import com.linkedin.utility.LinkedinServiceFactory;

public class LinkedinServiceTest {

	private LinkedinServiceInterface ls;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ls=LinkedinServiceFactory.createObject("user");
	}

	@After
	public void tearDown() throws Exception {
		ls=null;
	}

	@Test
	public void testCreateProfileService() {
		LinkedinUser lu=new LinkedinUser();
		lu.setName("siva");
		lu.setPassword("siva");
		lu.setMail("siva@gmail.com");
		
		int i=ls.createProfileService(lu);
		
		assert i>0 : "profile not created";
	}

	@Test
	public void testViewProfileService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testViewAllProfileService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testEditProfileService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testDeleteProfileService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testLoginProfileService() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testSearchProfileService() {
		System.out.println("Not yet implemented");
	}

}
