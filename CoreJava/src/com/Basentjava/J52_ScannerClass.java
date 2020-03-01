package com.Basentjava;

import java.util.Scanner;

public class J52_ScannerClass {

	//Example to get input from console
		//Example of the Java Scanner class which reads the int, string and double value as an input
	public static void main(String[] args) {

     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the Rollnumber");
     int roll =sc.nextInt();
     
     System.out.println("Enter the name");
     String name=sc.next();  //next() is used for string
     
     System.out.println("Enter the fees");
     double fee=sc.nextDouble();
     
     System.out.println("RollNumber:"+roll+" Name: "+name+" Fees: "+fee);
     

	}

}
