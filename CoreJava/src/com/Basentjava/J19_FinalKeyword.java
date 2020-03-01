package com.Basentjava;

final class Q{
	
	final void test1() {
		int i=10;
		i=20;
		System.out.println(i);
	}
    
}

class R extends Q{ // we cannot inherit 
	
	/*
	 * void test1() { //method in class Q is final so we can not override final methods
	 * 
	 * }
	 */
	
}

public class J19_FinalKeyword {

	public static void main(String[] args) {
		
		//Final variable values can’t be changed.
		int j=20;
		    j=30;
		    System.out.println(j);
		  final int i=10;
		   System.out.println(i);
		/*
		 * i=20; System.out.println(i); //compilation error
		 */
		    

	}

}
