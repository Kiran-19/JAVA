package com.Basentjava;

public class J05_GlobalAndLocalVariables {
	
	//Global/class/instance static variables
	static int i=20;
	static String name ="Java";
	
	//non-static variable
	 int j=30;

	public static void main(String[] args) {
		
		//local variables
		int i=40;
		String a="Selenium";
		
		//Below statement prints value of local variable i & s bcoz methods gives preference to local variables
		System.out.println(i);
		System.out.println(a);
		
		//Below statement prints value of global variable i & name
		System.out.println(J05_GlobalAndLocalVariables.i);
		System.out.println(J05_GlobalAndLocalVariables.name);
		
		//creating an instance of a class to access non static member in static method
		J05_GlobalAndLocalVariables obj=new J05_GlobalAndLocalVariables();
		
		//Below statement prints value of non static global variable j
		System.out.println(obj.j);

	}

}
