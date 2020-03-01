package com.Basentjava;

public class J47_StringClass {

	public static void main(String[] args) {
		
		String s1=new String("Kiran");
		System.out.println(s1);
		
		String s2="Raju";
		System.out.println(s2);
		
		System.out.println("********************");
		
		 //	String is immutable
		String s3="Sanjay";
		System.out.println(s3);
		
		
		s3="Sharma";
		System.out.println(s3);
		
		System.out.println("********************");
		
		String a="Java";
		String b="Java"; //both a and b refers to java(string constant pool 
		String c=new String("Java");
		String d=new String("Java");//new keyword creates new object in heap memory
		
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a==c);
		
		System.out.println("********************");
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		System.out.println(a.equals(c));
		
		System.out.println("********************");
		
		StringBuffer s4=new StringBuffer("Kiran");
		s4.append("123");
		System.out.println(s4);
		
		
	}

}
