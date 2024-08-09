package com.corejava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class object_write {

	public static void main(String[] args) throws IOException {
		File f1=new File("c:/revatureperungudi/four.txt");
		FileOutputStream fwrite=new FileOutputStream(f1);
		
		Employee e1=new Employee();
		e1.setName("anusha");
		e1.setEmail("anusha@gmail.com");
		e1.setPassword("aaa");
		e1.setAddress("chennai");
		e1.setSalary(200000.00f);
		
		ObjectOutputStream out=new ObjectOutputStream(fwrite);
		out.writeObject(e1);
		
		out.close();
		fwrite.close();
		System.out.println("Object written");		
	}

}
