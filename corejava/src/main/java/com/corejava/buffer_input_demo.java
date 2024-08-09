package com.corejava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class buffer_input_demo {
	public static void main(String[] args) throws IOException {

		File f2=new File("c:/revatureperungudi/third.txt");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please enter data");
		String inputdata=br.readLine();
		
		FileOutputStream fwrite=new FileOutputStream(f2);
		
		for(int i=0;i<inputdata.length();i++) {
			fwrite.write(inputdata.charAt(i));
		}
		fwrite.close();
		System.out.println("data coppied");
	}
		
}

