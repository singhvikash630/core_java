package com.jspider.jdk9;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesEnhancementDemo {

	public static void main(String[] args) throws IOException {
		/*JDk 1.7*/
		try(FileWriter fr=new FileWriter("abc.txt")) {
			
		} catch (Exception e) {
			
		}
		//not required finally block to close filewriter object
		
		/*JDk 1.9*/
		FileWriter fr1=new FileWriter("abc.txt");
		try(fr1) {
			
		} catch (Exception e) {
			
		}
		//not required finally block to close filewriter object

	}

}
