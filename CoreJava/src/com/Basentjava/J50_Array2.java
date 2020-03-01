package com.Basentjava;

import java.util.Arrays;

public class J50_Array2 {

	public static void main(String[] args) {
		
		//Printing array elements in reverse order
		
		int a[]= {1,4,5,3,9,7,8,6,2};
		Arrays.sort(a);
		
        for(int i:a) {
        	System.out.println(i);
        	//System.out.println("");
        }
        
        System.out.println("***********************");
        for(int i=a.length-1;i>=0;i--) {
        	System.out.println(a[i]);
        }
        //System.out.println("");
        
        System.out.println("***********************");
      //Reversing character array
        char c[]= {'a','b','c','d'};
        
      for(int i=c.length-1;i>=0;i--) {
    	System.out.println(c[i]);
      }
    	
    	 System.out.println("***********************");
    	//Revrsing the given string
    	String s1="Selenium";
    	    char c1[]= s1.toCharArray();
    	    for(int j=c1.length-1;j>=0;j--) {
    	    	System.out.println(c1[j]);
    	  
    }
	}

}
