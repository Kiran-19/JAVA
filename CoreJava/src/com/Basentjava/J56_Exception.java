package com.Basentjava;

public class J56_Exception {
	
	//The Java throw keyword is used to explicitly throw an exception.
	//We can throw either checked or uncheked exception in java by throw keyword.
	//The throw keyword is mainly used to throw custom exception.
	
	
	static void verify(int age) {
		if(age<21)
			throw new ArithmeticException("Not eligible to get marriage");	
		else
			System.out.println("Eligible to get marriage");
	}

	public static void main(String[] args) {
	     verify(25);
		System.out.println("rest of the code");

	}

}
