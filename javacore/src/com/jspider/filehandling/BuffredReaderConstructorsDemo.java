package com.jspider.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BuffredReaderConstructorsDemo {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fread=new FileReader("Demo3.txt");
		
		BufferedWriter bf=new BufferedWriter(FileReader w);
		BufferedWriter bf=new BufferedWriter(FileReader w,int buffersize);

	}

}
