package com.linkedin.view;

import java.util.Scanner;


import com.linkedin.controller.LinkedinController;
import com.linkedin.controller.LinkedinControllerInterface;

public class LinkedinView {
	public static void main(String[] args) {
        String ss="y";
		while(ss.equals("y")) {
		
		System.out.println("***********MAIN MENU***********");
		System.out.println("press 1 to continue");
		System.out.println("press 2 to continue");
		System.out.println("press 3 to continue");
		System.out.println("press 4 to continue");
		System.out.println("press 5 to continue");
		System.out.println("press 6 to continue");
		System.out.println("press 7 to continue");
		
		System.err.println("i am error");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter choice");
		int a=s.nextInt();
		
		LinkedinControllerInterface lc=new LinkedinController();
		/*above object creation is not following any design pattern
		we should create object of a class using creational design pattern from GOF
		we can use by factory design pattern or singleton design pattern */
		switch(a) {
		case 1: lc.createProfileController();
		break;
		case 2: lc.viewProfileController();
		break;
		case 3: lc.viewAllProfileController();
		break;
		case 4: lc.loginProfileController();
		break;
		case 5: lc.searchProfileController();
		break;
		case 6: lc.editProfileController();
		break;
		case 7: lc.deleteProfileController();
		break;
		default: System.out.println("invalid");
		}
		System.out.println("press y to continue");
		ss=s.next();

	}

}
}
