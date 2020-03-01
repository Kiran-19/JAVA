package com.Basentjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class J62_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Selenium");
		list.add("Java"); // it allows duplicate values
		list.add("Kiran");

		System.out.println(list);
		System.out.println("**************************");

		System.out.println(list.size()); // prints size of the array

//Retrieving the object/elements using for-loop
		System.out.println("**************************");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

		System.out.println("**************************");
		// Retrieving the object using for-each loop
		for (String a : list) {
			System.out.println(a);
		}

		System.out.println("**************************");

		//// Retrieving the objects using 'Iterator
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String obj = it.next();
			System.out.println(obj);
		}

		System.out.println("**************************");

		//Retrieving the objects using 'ListIterator
		ListIterator<String> itr = list.listIterator();
		//Output in forward direction
		while (itr.hasNext()) {
			String k = itr.next();
			System.out.println(k);
		}

		System.out.println("**************************");

	     //Output in reverse direction
		ListIterator<String> itr1 = list.listIterator();
		while (itr1.hasPrevious()) {
			String obj1 = itr1.previous();
			System.out.println(obj1);
		}

	}

}
