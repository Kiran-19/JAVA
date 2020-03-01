package com.Basentjava;

import java.util.ArrayList;

public class J63_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("Automation");
		al.add("Testing");
		al.add("java"); //it allows duplicate values
		
		//to get the element based on index
		System.out.println(al);
		System.out.println(al.get(0));
		
		//Modify the value in particular position
		al.set(1, "Selenium");
		System.out.println(al);
		
		//to add element/value in specific position
		al.add(2, "Java");
		System.out.println(al);
		
		//remove element at specific position
		al.remove(1);
		al.remove("Selenium");
		System.out.println(al);
		
		//It is used to search an element
		boolean status = al.contains("Java");
		System.out.println(status);
		
		//to remove all elements from the object
		al.removeAll(al);
		System.out.println(al);
		
		//tocheck the value is empty
		boolean check = al.isEmpty();
		System.out.println(check);
		
		
		
		

  
	}

}
