package com.Basentjava;

public class J48_StringMethods {

	public static void main(String[] args) {
		
  //CharAt
   String s1="Java";
   System.out.println(s1.charAt(2));
   System.out.println("******************");
 //Length
   System.out.println(s1.length());
   
   System.out.println("******************");
 //For loop to print length of String
   String s2="Selenium";
   for(int i=0; i<s2.length(); i++) {
	   System.out.println(s2.charAt(i));
   }
    System.out.println();
    
    System.out.println("******************");
  //equals and equalsIgnoreCase
    String s3=new String("Java");
    String s4="JAva";
    System.out.println(s3.equals(s4));
    System.out.println(s3.equalsIgnoreCase(s4));
    
    System.out.println("******************");
    //Substring
    String s5="Technologies";
    System.out.println(s5.substring(2));//from 2nd position it will extract
    System.out.println(s5.substring(2, 8)); //it will extract from 2 position till 8th position but it won't show last character
    
    System.out.println("******************");
    String s6="Manaul";
  //replace character
    System.out.println(s6.replace('a', 'c'));
  //replace string
    System.out.println(s6.replace("Man", "Hum"));
    
    System.out.println("******************");
  //indexOf: returns the index of the 1st occurance of the given 
  //charcter if it exists otherwise it returns -1
    String s7="Testing";
    System.out.println(s7.indexOf('e'));
    System.out.println(s7.indexOf('m', 2));
    
    System.out.println("******************");
  //trim() method removes spaces present either at beginning or end
  //it will not remove spaces b/w words or characters
    String s8="                 Test ing        ";
    System.out.println(s8.trim());
    
    
    
    
    
    

	}

}
