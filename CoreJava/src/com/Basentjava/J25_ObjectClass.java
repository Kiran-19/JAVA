package com.Basentjava;

class AA extends Object{
	void test1() {
		System.out.println("test1 method");
	}
}

class BB extends Object{
	void test2() {
		System.out.println("test2 method");
	}
}

class CC extends Object{
	void test3() {
		System.out.println("test3 method");
	}
}
public class J25_ObjectClass {

	public static void main(String[] args) {
		
		Object o1=new AA();
		Object o2=new BB();
		CC c=new CC();
		c.test3();
		Object o3=new CC();
		
		System.out.println(o3);
		System.out.println(c);
		System.out.println(c.equals(o3));
	}

}
