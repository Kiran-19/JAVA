package com.Basentjava;

import java.util.LinkedHashSet;

public class J66_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("sudeer");
		hs.add("selenium");
		hs.add("java");
		hs.add("sudeer");
		System.out.println(hs);
		
		LinkedHashSet<Integer> hs5=new LinkedHashSet<Integer>();
		hs5.add(1);
		hs5.add(5);//It can receive any type of objects. i.e here hs is String 
		///and hs5 is Integer which is not same		
		boolean xyz = hs.containsAll(hs5);
		System.out.println(xyz);
		System.out.println(hs);
		
		LinkedHashSet<String> hs1=new LinkedHashSet<String>();
		hs1.add("sudeer");
		hs1.add("selenium1");
		hs1.add("java");
		hs1.add("sudeer");
		
		for(String s:hs)
		{
			//LinkedHashSet gives ordered output
			System.out.println(s);
		}
		
		boolean equals = hs.equals(hs1);
		System.out.println(equals);
		
		boolean all = hs.containsAll(hs1);
		System.out.println(all);
		
		hs.addAll(hs1);
		System.out.println(hs);

	}

}
