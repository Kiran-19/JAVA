/**
 * 
 */
package com.Basentjava;

import java.io.File;

/**
 * @author KIRAN
 *
 */
public class J59_FileHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File f=new File("E:\\FileHandling");
		//to check folder exists or not
		System.out.println(f.exists()); //returns true/false
		//to delete a folder if exist
		f.delete();
		//to check folder exists or not
		System.out.println(f.exists());
		

	}

}
