package com.Basentjava;

import java.io.File;

public class J58_FileHandling {

	public static void main(String[] args) {

    File f1=new File("E:\\FileHandling"); //we can use "//"
    //to check folder exists or not
    System.out.println(f1.exists()); //returns true/false
  //to create a folder if does not exist
    f1.mkdir();
  //to check folder exists or not
    System.out.println(f1.exists());

	}

}
