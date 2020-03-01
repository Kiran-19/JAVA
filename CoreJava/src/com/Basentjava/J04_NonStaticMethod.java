package com.Basentjava;

public class J04_NonStaticMethod {

	// Execution starts from main method
	public static void main(String[] args) {
		
		
		System.out.println("Program starts");
		//Creating an object of class to call "add" method
		J04_NonStaticMethod non=new J04_NonStaticMethod();
		int res=non.add(50, 50);
		System.out.println("The result is " + res);
		System.out.println("Program ends");
		
	}
	//To add numbers
	public int add(int x, int y) {
		
		return x+y;
		
	}

}
