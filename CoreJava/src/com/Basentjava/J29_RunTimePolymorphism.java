package com.Basentjava;

interface Animals{
	
	void makesound();
}

class Dogs implements Animals{

	@Override
	public void makesound() {
	System.out.println("Bow Bow");
		
	}
}
class Cat implements Animals{

	@Override
	public void makesound() {
	System.out.println("Meow Meow");
		
	}
}


public class J29_RunTimePolymorphism {

	public static void main(String[] args) {
		
		Animals a;  //here "a" is a polymorphic variable
	   a=new Dogs();//this is runtime polymorphism bcoz by looking at this statement, we can't say which method of the class will be executed
		//it is decided during run time (this line is dependent on previous line and executes the code.)
		
	  a.makesound();
	  
	  a=new Cat(); 
	  a.makesound();
	  
	  

	}

}
