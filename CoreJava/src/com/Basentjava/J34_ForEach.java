package com.Basentjava;

/*
The for each loop is used to traverse array or collection in java. It is easier to use than simple for loop
because we don't need to increment value and use subscript notation.
It works on elements basis not index.It returns element one by one in the defined variable.  
*/


public class J34_ForEach {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
