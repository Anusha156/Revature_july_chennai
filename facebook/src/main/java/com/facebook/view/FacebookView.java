package com.facebook.view;

import java.util.Scanner;

import com.facebook.controller.FacebookController;
import com.facebook.controller.FacebookControllerInterface;

public class FacebookView {

		public static void main(String[] args) {
			System.out.println("MAIN MENU*");
			System.out.println("enter a choice");
			System.out.println("press 1 login");
			System.out.println("press 2 for profile");
			System.out.println("press 3  for delete");
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			FacebookControllerInterface fc=new FacebookController();
			
			
			switch(a) {
			case 1: fc.createController();
			     break;
			case 2: fc.deleteController();
				break;
			case 3 : fc.editController();
				break;
				default: System.out.println("invalid");
			}
				

		}

	}

