package com.Basentjava;

public class J07_DefaultConstructor {
	
	//creating default constructor
	J07_DefaultConstructor(){
		System.out.println("Executing Default Constructor");
	}

	void test1() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		J07_DefaultConstructor d = new J07_DefaultConstructor();
		d.test1();

	}

}
