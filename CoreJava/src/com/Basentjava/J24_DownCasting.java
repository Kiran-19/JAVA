package com.Basentjava;

//Downcasting is used only to down cast the upcasted objects

class C {
	void test1() {
		System.out.println("test1 method of C class");
	}
}

class D extends C {
	void test2() {
		System.out.println("test2 method of D class");
	}
}

public class J24_DownCasting {

	public static void main(String[] args) {

		D d2 = (D) new C();// runtime exception, not compile time error
		C a1 = new D(); // Upcasted D type to C Type
		D d1 = (D) a1; // Down casting C to D type bcoz Downcasting is used only to down cast the
						// upcasted objects
		d1.test1();
		d1.test2();

	}

}
