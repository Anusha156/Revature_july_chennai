package com.linkedin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.linkedin.controller.LinkedinControllerInterface;
import com.linkedin.utility.LinkedinControllerFactory;

public class LinkedinControllerTest {
	
	private LinkedinControllerInterface lc;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("loading global resource");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("unloading global resource");
	}

	@Before
	public void setUp() throws Exception {
		lc=LinkedinControllerFactory.createObject("user");
	}

	@After
	public void tearDown() throws Exception {
		lc=null;
	}

	@Test
	public void testCreateProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testViewProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testViewAllProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testEditProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testDeleteProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testLoginProfileController() {
		System.out.println("Not yet implemented");
	}

	@Test
	public void testSearchProfileController() {
		System.out.println("Not yet implemented");
	}

}
