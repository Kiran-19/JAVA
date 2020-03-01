package com.Basentjava;

class A1{
	
	void test1() {
		System.out.println("This is test1 method");
	}
}

class A2 extends A1{
	
	void test2() {
		System.out.println("This is test2 method");
	}
}

public class J15_Inheritance {

	public static void main(String[] args) {
		
		A2 a = new A2();
		a.test1();
		a.test2();

	}

}
