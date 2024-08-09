package com.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class object_read_demo {
	public static void main(String[] args) throws IOException, Exception {
		File f1=new File("c:/revatureperungudi/five.txt");
		FileInputStream fread=new FileInputStream(f1);
		
		ObjectInputStream oread=new ObjectInputStream(fread);
		
		Employee e=(Employee) oread.readObject();
		System.out.println("Name is:"+e.getName());
		System.out.println("Email is:"+e.getEmail());
		System.out.println("Password is:"+e.getPassword());
		System.out.println("Address is:"+e.getAddress());
		System.out.println("Salary is:"+e.getSalary());
		
	
	}

}



