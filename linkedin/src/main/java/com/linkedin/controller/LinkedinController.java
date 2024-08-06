package com.linkedin.controller;

import java.util.List;
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
			System.out.println("Password is -->"+l1.getPassword());
			System.out.println("Mail is -->"+l1.getMail());
		}
		else {
			throw new profileNotFoundException("Profile not found for given mail id "+email);
			
			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void viewAllProfileController() {
		// to maintain low coupling we are storing in interface
		LinkedinServiceInterface ls=new LinkedinService();
		List<LinkedinUser> l2= ls.viewAllProfileService();  //List<LinkedinUser> this is known as generic collection
        
		for(LinkedinUser vv:l2) {
			System.out.println("************************");
			System.out.println("Your profile is ");
			System.out.println("Name is -->"+vv.getName());
			System.out.println("Mail is -->"+vv.getMail());
			System.out.println("Password is -->"+vv.getPassword());
			
		}
	
	
	}

	

	public void editProfileController() {
        Scanner s=new Scanner(System.in);
		
		System.out.println("enter email to edit profile");
		String email=s.next();
		
		LinkedinUser lu=new LinkedinUser();
		lu.setMail(email);
		
		LinkedinServiceInterface ls=new LinkedinService();
		LinkedinUser l1=ls.viewProfileService(lu);
		try {
		if(l1!=null) {
			System.out.println("Your old profile is ");
			System.out.println("Name is -->"+l1.getName());
			System.out.println("Mail is -->"+l1.getMail());
			System.out.println("Password is -->"+l1.getPassword());
			
			System.out.println("press 1 to change password");
			System.out.println("press 2 to change name");
			System.out.println("Enter choice");
			int c=s.nextInt();
			
			switch(c) {
			case 1:System.out.println("Enter new password");
			       String npassword=s.next();
			       l1.setPassword(npassword);
			       int i=ls.editProfileService(l1);
			       
			       if(i>0) {
			    	   System.out.println("password changed");
			       }
				break;
			case 2:System.out.println("Enter name");
			       String pname=s.next();
			       l1.setName(pname);
			       int i1=ls.editProfileService(l1);
			       
			       if(i1>0) {
			    	   System.out.println("Name changed");
			       }
				break;
			default: System.out.println("wrong choice");
			
			}
		}
		else {
			throw new profileNotFoundException("Profile not found for given mail id "+email);
			
			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public void deleteProfileController() {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter email to delete profile");
		String email=sc.next();
		
		LinkedinUser lu=new LinkedinUser();
		lu.setMail(email);
		
		LinkedinServiceInterface ls=new LinkedinService();
		int ll=ls.deleteProfileService(lu);
		if(ll>0) {
			System.out.println("profile deleted");
		}
		
	}

	@Override
	public void loginProfileController() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter email to login profile");
		String email=s.next();
		
		LinkedinUser lu=new LinkedinUser();
		lu.setMail(email);
		
		LinkedinServiceInterface ls=new LinkedinService();
		int i=ls.loginProfileService(lu);
		
		if(i>0) {
			System.out.println("Successfully login completed");
		}
		
		
		
		
		
	}

	@Override
	public void searchProfileController() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name to search profile");
		String name=s.next();
		
		LinkedinUser lu=new LinkedinUser();
		lu.setName(name);
		
		LinkedinServiceInterface ls=new LinkedinService();
		List<LinkedinUser> l2=ls.searchProfileService(lu);
		
		for(LinkedinUser vv:l2) {
			System.out.println("************************");
			System.out.println("Your profile is ");
			System.out.println("Name is -->"+vv.getName());
			System.out.println("Mail is -->"+vv.getMail());
			System.out.println("Password is -->"+vv.getPassword());
			
		}
		
		
	}

	
	
}
