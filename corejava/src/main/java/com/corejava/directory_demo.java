package com.corejava;

import java.io.File;

public class directory_demo {
	public static void main(String[] args) {
		File f=new File("c:/revatureperungudi");
		if(f.mkdir()) {
			System.out.println("directory created");
		}
		else {
			System.out.println("directory not created");
		}
	}

}
