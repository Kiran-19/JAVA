package com.Basentjava;

public class J32_1_Encapsulation {
	
	private int size;
	
	public int setsize(int s) {
		
		if(s>=5) {
			size=s;
		}
		else {
			size=4;
		}
		return s;
	}
	
	public int getsize() {
		return size;
	}

}
