package com.Basentjava;
//this is for implicit call of super class constructor
class F{
	F(){
		System.out.println("Default F ctt");
	}
}

class G extends F{
	
	G(){
		System.out.println("Default G ctt");
	}
}

class H extends G{
	H(){
		System.out.println("Default H ctt");
	}
}

public class J16_SupersStatement {

	public static void main(String[] args) {
		
		H obj = new H();
		
		

	}

}
