package com.linkedin.view;

import java.util.Scanner;

import com.linkedin.controller.LinkedinController;
import com.linkedin.controller.LinkedinControllerInterface;

public class LinkedinView {
	public static void main(String[] args) {
		System.out.println("press 1 to continue");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		LinkedinControllerInterface lc=new LinkedinController();
		switch(a) {
		case 1: lc.createProfileController();
		break;
		default: System.out.println("invalid");
		}
		
	}

}
