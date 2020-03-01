package com.Basentjava;

import java.util.HashSet;

public class J65_HashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("sudeer");
		hs.add("selenium");
		hs.add("java");
		hs.add("sudeer");
		
		System.out.println(hs);
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("sudeer");
		hs1.add("Besant");
		hs1.add("java");
		hs1.add("sudeer");
		System.out.println(hs1);
		//Iterator<String> itr = hs.iterator();
		
		
		boolean equals = hs.equals(hs1);
		System.out.println(equals);
		
		boolean all = hs.containsAll(hs1);
		System.out.println(all);
		
		hs.addAll(hs1);
		System.out.println(hs);

	}

}
