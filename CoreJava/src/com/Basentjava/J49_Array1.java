package com.Basentjava;

public class J49_Array1 {

	public static void main(String[] args) {

	 //int array
      int a[]=new int[5];
      a[0]=10;
      a[1]=20;
      a[2]=30;
      a[3]=40;
      a[4]=50;
      //a[5]=60; //java.lang.ArrayIndexOutOfBoundsException
      
      for (int i=0;i<a.length;i++) {  // replace 5 with "a.length" both gives same meaning
    	  System.out.println(i);
      }
      
      System.out.println("**************");
      
      //String array
      String s[]=new String[3];
      s[0]="Java";
      s[1]="Selenium";
      s[2]="Manual";
      
      
      for(int i=0;i<3;i++){
    	  System.out.println(s[i]);
      }
    	  System.out.println("**************");
    	  
    	//we can use "for-each" also instead of for loop.it is used to iterate
  		//elements in arrays or collection. its also called as advanced for
    	  for(String j:s) {
    		  System.out.println(j);
    		  
    	  }
      }
	}


