package com.jspider.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffredReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("Demo2.txt");
		 BufferedReader fr=new BufferedReader(reader);
		 String lne=fr.readLine();
		 while (lne!=null) {
			System.out.println(lne);
			lne=fr.readLine();			
		}
		 fr.close();
	}

}
