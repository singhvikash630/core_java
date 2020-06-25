package com.jspider.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuffredReaderMethodsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader reader=new FileReader("Demo2.txt");
		 BufferedReader fr=new BufferedReader(reader);
	       fr.read();//read character wise and return unicode value
	       
	       Char[] ch=new Char[100];
	       fr.read(ch);//return the length of the array size
	       
	       fr.readLine();//read line by line,for empty it will return null
	       
	       fr.close();//close the FR object

	}

}
