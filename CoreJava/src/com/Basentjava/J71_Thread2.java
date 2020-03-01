package com.Basentjava;

////creating thread by implementing runnable interface
class Example2 implements Runnable
{

	public void run() 
	{
		System.out.println("thread is running...");  
		
	}
	
}

public class J71_Thread2 
{
	public static void main(String[] args) 
	{
		Example2 ex2=new Example2();
		Thread t=new Thread(ex2);//If you are not extending the Thread class,your class object would not be treated as a thread object.
		//So you need to explicitly create Thread class object.We are passing the object of your class that implements Runnable so that your class run() method may execute.
		t.start();
	}

}
