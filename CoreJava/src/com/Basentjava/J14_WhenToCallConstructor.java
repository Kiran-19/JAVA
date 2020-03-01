package com.Basentjava;

class Box{
	
	int height;
	int width;
	int length;
	String color;
	
	Box(){
		System.out.println("Default ctt");
	}
	

	Box(int h, int w, int l){
		
		height=h;
		width=w;
		length=l;
	}
	

	Box(int h, int w, int l, String c){
		
		/*height=h;
		width=w;
		length=l;
		To reduce the above 3 lines of repeated code we call the above constructor using this() statement*/
		this(h,w,l); //this will call the above constructor
		color=c;
		
	}
}


public class J14_WhenToCallConstructor {

	public static void main(String[] args) {
		Box b = new Box(10,20,30,"Blue");
		System.out.println(b.height);
		System.out.println(b.width);
		System.out.println(b.length);
		System.out.println(b.color);

	}

}
