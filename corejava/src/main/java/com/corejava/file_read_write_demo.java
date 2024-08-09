package com.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_read_write_demo {
	public static void main(String[] args) throws IOException {
		File f=new File("c:/revatureperungudi/one.txt");
		File f2=new File("c:/revatureperungudi/two.txt");
		
		FileInputStream fread=new FileInputStream(f);
		FileOutputStream fwrite=new FileOutputStream(f2);
		
		int c=0;
		while(!((c=fread.read())==-1)) {
			fwrite.write(c);
		}
		fwrite.close();
		fread.close();
		System.out.println("data coppied");
	}
		
}
