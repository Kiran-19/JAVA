package com.Basentjava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class J60_FileHandling {

	public static void main(String[] args) throws IOException {
		//This prog is for for creating new file. Writing data into file
		File f = new File("E:\\FileHandling.txt");
		//to create file. It will create file if it doesn't exist
		System.out.println(f.exists());

		f.createNewFile();
		
		System.out.println(f.exists());
		
		//to write data into file
		FileWriter fw=new FileWriter(f);
		//to write in 1st line
		fw.write("Selenium Automation Testing"); //it will be stored in Ram and when you FLUSH/close file then it will be written into file
		fw.flush();//this is like saving the file after writing data
		//fw.close(); //If you close the file here, you cannot write data into next line using below code
		
		//to write data into next line
		BufferedWriter br=new BufferedWriter(fw);
		br.newLine();
		br.write("Manual Testing");
		br.flush();
		br.close();
		
		

	}

}
