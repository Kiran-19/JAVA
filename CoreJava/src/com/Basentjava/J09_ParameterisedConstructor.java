package com.Basentjava;

public class J09_ParameterisedConstructor {

	static String s1;//default value for derived type is "null"
	public static void main(String[] args) {
		
		System.out.println("Program starts");
		Emp e=new Emp("Kiran", 29);
		System.out.println("Name:" +e.name);
		System.out.println("Age:"+e.age);
		
		System.out.println("**************************");
		Emp e1=new Emp("Sudeer",29);
		System.out.println("Name:" +e1.name);
		System.out.println("Age:"+e1.age);
		System.out.println("Program ends");

	}

}

 class Emp{
	 
	 String name; //instance variable/global/class variable
	 int age;     //instance variable/global/class variable
	 
	 Emp(String n, int a){  //parameterized constructor
		 
		 name=n;
		 age=a;
	 }
 }