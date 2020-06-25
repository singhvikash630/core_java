package com.jspider.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {


	public static void main(String[] args) throws IOException {
		File f=new File("demo2.txt"); 	      
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int) f.length()];//typecast long to int
		System.out.println(fr.read(ch));//reading the file and copying into ch array
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println("-----------------------------------");
		File f1=new File("demo2.txt"); 	      
		FileReader fr1=new FileReader(f1);
		int i=fr1.read	();
		while(i != -1){
			System.out.println((char)i);//typecast int to char
			i=fr1.read();
		}



	}

}
