package com.Basentjava;

import java.util.LinkedList;

public class J64_LinkedList {

	public static void main(String[] args) {
		
		//It has some additonal methods compared to ArrayList
LinkedList<Integer> ll=new LinkedList<Integer>();

ll.add(1);
ll.add(2);
ll.add(3);

System.out.println(ll);
//To add element at 1st position
ll.addFirst(10); //It is used to insert the given element at the beginning of a list.
System.out.println(ll);

//to add element at last
ll.addLast(20);
System.out.println(ll);

//To get first element
Integer first=ll.getFirst();
System.out.println(first);

//To get last element
Integer last=ll.getLast();
System.out.println(last);

//To remove first element
ll.removeFirst();
System.out.println(ll);


//To remove last element
ll.removeLast();
System.out.println(ll);


LinkedList<Integer> l2=new LinkedList<Integer>();
l2.add(1);
l2.add(2);
l2.add(3);

//Retrieves, but does not remove, the head (first element) of this list
Integer head1=l2.peek();
System.out.println(head1);
System.out.println(l2);//to check whether it removed the head

//Retrieves and removes the head (first element) of this list.

Integer head2=l2.poll();
System.out.println(head2);
System.out.println(l2);//to check whether it removed the head
 
	}

}
