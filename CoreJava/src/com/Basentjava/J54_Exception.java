package com.Basentjava;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class J54_Exception {

	public static void main(String[] args) throws FileNotFoundException {
	
	       try {
			FileReader file = new FileReader("D:\\TestData\\Text.txt");
	       }
	       catch(FileNotFoundException e) {
	    	   System.out.println("File is not found - This is 1st catch block");
	       }catch(Exception e) {
	    	   System.out.println("File is not found - This is 2nd catch block");
	       }
		

	}

}
