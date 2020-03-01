package com.Basentjava;

class A111{
	void test1() {
		System.out.println("test1 method");
	}
	
}

class B111 extends A111{
	void test2() {
		System.out.println("test2 method");
	}
	
}
class C111 extends B111{
	void test3() {
		System.out.println("test3 method");
	}
	
}

public class J26_Polymorphism {

	public static void main(String[] args) {
		
        C111 c = new C111();
        c.test1();
        c.test2();
        c.test3();
        
        System.out.println("***************");
        
        B111 b=c;
        b.test1();
        b.test2();
        
        System.out.println("***************");
        
        A111 a=c;
        a.test1();
        

	}

}
