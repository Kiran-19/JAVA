package com.Basentjava;

//creating thread by extending ‘Thread’ class
class Example1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
}

public class J70_Thread1 
{
	public static void main(String[] args) 
	{
		Example1 ex=new Example1();
		ex.start();
		
		
		
		

	}

}
