package com.Basentjava;

class Tree1{
	
	int height; //here height is instance variable
	
	Tree1(int h){  //here height is local variable
		this.height=h;
	}
}

public class J11_ThisKeyword {

	public static void main(String[] args) {
	
		System.out.println("program starts");
		Tree1 t1= new Tree1(5);//Default values for byte,short,int and long is 0,, for double and float=0.0 and for char=empty and for boolean=false
		System.out.println(t1.height);
		System.out.println("program ends");

	}

}
