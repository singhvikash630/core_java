package com.jspider.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BuffredWriterMethodsDemo {

	public static void main(String[] args) {
		BufferedWriter bf=new BufferedWriter(new FileWriter("demo2.txt"));
		
		//same as FileWriter
		bf.write('a');//to write a single character
        
		bf.write(char[] ch);//to write array of characters
	        
		bf.write(String s);//to write string to the file		
	        
		bf.flush();//to give the guarntee that total data transfer to the file.
	        
		bf.close(); 
		
		//Extra method
		
		bf.newLine();//to insert a line separator

	}

}
