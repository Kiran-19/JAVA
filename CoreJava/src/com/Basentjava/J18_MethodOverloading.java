package com.Basentjava;

class Animal{
	
	void move() {
		System.out.println("Move method in Animal class");
	int a=20;
	int b=30;
	System.out.println(a+b);
	
	}
	
}

class Dog extends Animal{
	
	void move() {
		int front_legs=2;
		int back_legs=2;
		int Total_legs=front_legs+back_legs;
		System.out.println(Total_legs);
		System.out.println("Dog have 4 legs and it walks");
		
	}
}

class Snake extends Animal{
	
	void move() {
		String legs="Snake has no legs";
		System.out.println(legs);
		System.out.println("Snake has no legs and it crawls");
	}
}

public class J18_MethodOverloading {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.move();
		Dog d=new Dog();
		d.move();
		Snake s=new Snake();
		s.move();

	}

}
