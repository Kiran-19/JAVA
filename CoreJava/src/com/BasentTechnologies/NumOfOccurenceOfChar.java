package com.BasentTechnologies;
public class NumOfOccurenceOfChar {
	public static void main(String[] args) 
	{
		NumOfOccurenceOfChar num=new NumOfOccurenceOfChar();
		int result = num.countChar("mnoprqeee eee", 'e');
				
		System.out.println(result);
	}
	
	public  int countChar(String str, char c)
	{
	    int count = 0;

	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == c)
	            count++;
	    }

	    return count;
	}
}