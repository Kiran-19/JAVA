
package com.Basentjava;

class Tree{
	
	int height;//here height is instance variable
	
	Tree(int h){ //here height is local variable
		height=h;
	}
	
}

public class J10_WithOutThisConstructor {

	public static void main(String[] args) {
		
		System.out.println("Program starts");
		Tree t=new Tree(5); //Default values for byte,short,int and long is 0, 
		//for double and float=0.0 and for char=empty and for boolean=false
		//for String=null
		System.out.println(t.height);
		System.out.println("Program ends");
		

	}

}
