package com.Basentjava;

class Abc{
	
	Abc(){ //default constructor
		System.out.println("Default ctt");
	}

	Abc(int a){//parameterized ctt
		this();
		System.out.println("Parameterized ctt");
	}
	
	Abc(int a, int b){ //default constructor
		//this();
		this(a);
		System.out.println("Default ctt");
	}
	
}

public class J13_CallToThisStatement {
	
	public static void main(String[] args) {
		
	  Abc a=new Abc(10,10);
		
		
			
		
	}

}
