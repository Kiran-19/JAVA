package com.Basentjava;

public class J55_Exception {

	public static void main(String[] args) {
		
		//This is for finally block
		try {
        int data=25/0;     //exception occurs
		} 
		catch (ArithmeticException e) {  //handling the exception
			System.out.println(e.getMessage());
		}
      finally { //finally block is always executed whether
			//the exception occurs or not
    	  
    	  System.exit(1);
    	  System.out.println("final block is always executed");
    	  System.out.println("rest of the code ");
      }

	}

}
