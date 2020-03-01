package com.Basentjava;

public class J22_PrimitiveCasting {

	public static void main(String[] args) {
		
		int a=(int)10.2; // narrowing i.e converting double type to int type
		System.out.println(a);
		double d = (double)10; // widening
		System.out.println(d);
		//java implicitly does widening
		double d1=10;  //Auto widening
		System.out.println(d1);
		double d2=(20); // auto widening
		System.out.println(d2);
		float f = (float)12.2; 
		System.out.println(f);
		//int a1=10.22;//compilation error bcoz auto narrowing is explicit
		//int a2=(10.33); //compilation error bcoz auto narrowing is explicit

	}

}
