package com.Basentjava;

class Shape{
	
	int d1;
	int d2;
	
	Shape(int a, int b){
		d1=a;
		d2=b;
	}
}

class Rectangle extends Shape{
	Rectangle(int l,int b){
		super(l,b);
	}
	int getArea() {
		return d1*d2;
	}
	
}

class Triangle extends Shape{
	
	Triangle(int n, int h){
		super(n,h);
	}
	
	int getArea() {
		return (d1*d2)/2;
	}
}

public class J17_SuperStatement1 {

	public static void main(String[] args) {
		Triangle tra=new Triangle(10,20);
		System.out.println(tra.getArea());
		
		Rectangle rec=new Rectangle(5,5);
		System.out.println(rec.getArea());

	}

}
