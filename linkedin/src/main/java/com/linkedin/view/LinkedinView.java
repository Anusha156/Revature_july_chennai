package com.linkedin.view;

import java.util.Scanner;


import com.linkedin.controller.LinkedinController;
import com.linkedin.controller.LinkedinControllerInterface;

public class LinkedinView {
	public static void main(String[] args) {
		System.out.println("***********MAIN MENU***********");
		System.out.println("press 1 to continue");
		System.err.println("i am error");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter choice");
		int a=s.nextInt();
		
		LinkedinControllerInterface lc=new LinkedinController();
		switch(a) {
		case 1: lc.createProfileController();
		break;
		case 2: lc.viewProfileController();
		break;
		default: System.out.println("invalid");
		}
		System.out.println("press y to continue");

	}

}
