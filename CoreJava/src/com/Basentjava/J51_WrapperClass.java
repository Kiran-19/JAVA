package com.Basentjava;

public class J51_WrapperClass {

	public static void main(String[] args) {

		//Boxing
         byte b=10;
         Byte b1=new Byte(b);
         System.out.println(b1);
         
         int a=20;
         Integer i=new Integer(a);
         System.out.println(i);
         
         double d = 20.33;
         Double d1=new Double(d);
         System.out.println(d1);
         
         //Unboxing
         
         Double d2=new Double(10.10);
         int d3=d2.intValue();
         System.out.println(d3);
         
         Integer i2=new Integer(30);
         int i3=i2.intValue();
         System.out.println(i3);
         
       
         //Auto boxing
         // int x=5;
         Integer x1=5; //Auto boxing
         System.out.println(x1);
         
         //Auto unboxing
         Integer i4=new Integer(10);
         int i5=i4;  //Auto-unboxing
         System.out.println(i5);
         
	}

}
