package com.Basentjava;

interface I1 {

	void test1(); // or public abstract void test1(); both are same

	int i = 10; // or static final int i=10; both are same
}

//class can implement intereface
class Xyz implements I1 {

	@Override
	public void test1() {
		System.out.println("test1 method");

	}

}

public class J27_Interface1 {

	public static void main(String[] args) {

		Xyz a = new Xyz();
		a.test1();
	}

}
