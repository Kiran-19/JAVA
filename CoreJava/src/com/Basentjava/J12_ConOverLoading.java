package com.Basentjava;

class A{
	
	A(){
		System.out.println("Default constructor");
	}

	A(int a){
		System.out.println("constructor with 1 args");
	}
	
	A(int a, int b){
		System.out.println("constructor with 2 args");
	}
	
}

public class J12_ConOverLoading {
	
	public static void main(String[] args) {
		
		A a1=new A();
		A a2=new A(10);
		A a3=new A(10,15);
		
	}

}
