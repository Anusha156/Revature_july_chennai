package com.linkedin.controller;

import java.util.Scanner;

import com.linkedin.entity.LinkedinUser;
import com.linkedin.exception.profileNotFoundException;
import com.linkedin.service.LinkedinService;
import com.linkedin.service.LinkedinServiceInterface;


public class LinkedinController implements LinkedinControllerInterface {

	public void createProfileController() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name:");
		String name=sc.next();
		
		System.out.println("enter mail:");
		String mail=sc.next();
		
		System.out.println("enter password:");
		String password=sc.next();
		
		//step1 end
		//step2 create object of entity and set all value inside entity to pass to service
		
		LinkedinUser lu=new LinkedinUser();
		lu.setName(name);
		lu.setMail(mail);
		lu.setPassword(password);
		
		//step2 end
		//step3 create object of service via interface to maintain low coupling
		
		LinkedinServiceInterface ls=new LinkedinService();
		int i=ls.createProfileService(lu);
		
		if(i>0) {
			System.out.println("profile created");
		}
		else {
			System.err.println("profile rejected");
		}

	}

	@Override
	public void viewProfileController() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter email to view profile");
		String email=s.next();
		
		LinkedinUser lu=new LinkedinUser();
		lu.setMail(email);
		
		LinkedinServiceInterface ls=new LinkedinService();
		LinkedinUser l1=ls.viewProfileService(lu);
		try {
		if(l1!=null) {
			System.out.println("Your profile is ");
			System.out.println("Name is -->"+l1.getName());
			System.out.println("Mail is -->"+l1.getMail());
			System.out.println("Password is -->"+l1.getPassword());
		}
		else {
			throw new profileNotFoundException("Profile not found for given mail id "+email);
			
			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
