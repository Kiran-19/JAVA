package com.Basentjava;

class Up1{
	void test1() {
		System.out.println("test1 method of Up1 Class");
	}
}

class Up2 extends Up1{
	void test2() {
		System.out.println("test2 method of Up2 Class");
	}
}

public class J23_Upcasting {

	public static void main(String[] args) {
		
		Up1 a2=(Up1) new Up2();
		   // OR
		Up1 a=new Up2();
		a.test1();
		
		
		

	}

}
