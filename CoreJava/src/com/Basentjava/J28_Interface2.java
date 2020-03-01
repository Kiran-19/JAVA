package com.Basentjava;

interface I2{
	void test1();
}

interface I3 extends I2{
	void test2();
}

class CA1 implements I2, I3{

	@Override
	public void test2() {
		System.out.println("test2 method");
		
	}

	@Override
	public void test1() {
		System.out.println("test1 method");
		
	}
	
}
public class J28_Interface2 {

	public static void main(String[] args) {
		
		CA1 c=new CA1();
		c.test1();
		c.test2();

	}

}
