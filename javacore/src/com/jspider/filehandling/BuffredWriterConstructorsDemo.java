package com.jspider.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BuffredWriterConstructorsDemo {

	
	public static void main(String[] args) {
		BufferedWriter bf=new BufferedWriter(Writer w);
		BufferedWriter bf=new BufferedWriter(Writer w,int buffersze);
		
		//Example
		BufferedWriter bf=new BufferedWriter(new FileWriter("demo.txt"));
		//two level buffering for some performance mprovements
		BufferedWriter bf=new BufferedWriter(new BufferedWriter(new FileWriter("demo.txt")));

	}

}
