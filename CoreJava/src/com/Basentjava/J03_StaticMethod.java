package com.Basentjava;

public class J03_StaticMethod {

	//Execution starts from Main Method
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		
		// calling the static "add" method with the required inputs
		//if it is in the same class, u can access static method by method name itself
		int result=add(20, 20);
		System.out.println("The Result is " + result);
		
		//if it is in the different class, u can access static method by Classname.method name 
		 int result1=J03_StaticMethod.add(8, 9);
		 System.out.println("The Result is " + result1);
		 System.out.println("Program ends");

	}
	//To add the numbers
	public static int add(int a, int b) {
		
		int sum = a+b;
		return sum;
		
		//return a+b;
		//Statements present after return statements are known as unreachable statements
		//System.out.println("Java");
		
	}

}
