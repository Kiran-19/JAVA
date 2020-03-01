package com.Basentjava;

abstract class Abs{
	abstract void test1();
}

class Abs1 extends Abs{ //compilation error bcoz we extended Abs1 class to Abs class but
	// we did not implement test1() method. Either we should implement test1() method
	//in sub class or we should declare sub class as abstract
	
	void test1() {
		System.out.println("test1 method of Abs class");
	}
	
	void test2() {
		System.out.println("test2 method of Abs1 class");
	}
}

class Abs2 extends Abs1{
	
	void test3() {
		System.out.println("test3 method of Abs2 class");
	}
	
	void test4() {
		System.out.println("test4 method of Abs2 class");
	}
}

public class J21_Abstratct3 {

	public static void main(String[] args) {
		
		Abs1 a=new Abs1();
		a.test1();
		a.test2();
		
		System.out.println("********************");
		Abs2 obj=new Abs2();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	}

}
