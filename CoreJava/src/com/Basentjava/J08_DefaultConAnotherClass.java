package com.Basentjava;

public class J08_DefaultConAnotherClass {

	public static void main(String[] args) {
		One o=new One();
		o.test1();
	}
}
	
 class One{
	 
	 One(){
		 System.out.println("Default Constuctor");
	 }
	 
	 void test1() {
		 System.out.println("test1  method");
	 }
 }
	


