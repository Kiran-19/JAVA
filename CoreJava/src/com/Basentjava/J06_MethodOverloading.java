package com.Basentjava;

public class J06_MethodOverloading {

	public static void main(String[] args) {
		
		J06_MethodOverloading obj=new J06_MethodOverloading();
		System.out.println(obj.add(5, 5));
		System.out.println(obj.add(5, 10, 20));
		System.out.println(obj.add(2, 5.5));
		System.out.println(obj.add(10.22, 10));
	}

	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	//the below is not method overloading bcoz we have same data types
	/*
	 * public int add(int x, int y, int z ) { return a+b; }
	 */
	
	public double add(int a, double b) {
		return a+b;
	}
	
	public double add(double a, int b) {
		return a+b;
	}
	//the below method throws compile time error bcoz the return type is int instead of double.
	 //we cannot consider double type as int type, we have to cast the value
	/*
	 * public int add(int a, int b,double c) { return a+b+c; }
	 */
	
	
}
