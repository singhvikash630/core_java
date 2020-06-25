package com.jspider.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffredWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc.txt");
		BufferedWriter bf=new BufferedWriter(fw);
		bf.write(100);
		bf.newLine();
		char[] ch={'a','c','v','b'};
		bf.write(ch);
		bf.newLine();
		bf.write("durga");
		bf.newLine();
		bf.write("solutons");
		bf.flush();
		bf.close();

	}

}
