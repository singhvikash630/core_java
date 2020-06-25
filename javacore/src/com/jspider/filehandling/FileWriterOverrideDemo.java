package com.jspider.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOverrideDemo {

    public static void main(String[] args) throws IOException {
       
        FileWriter fw=new FileWriter("Demo2.txt");
        System.out.println("FW="+fw);
        fw.write(100);
        fw.write("\n");
        fw.write("urgaSolutions");        
        fw.flush();
        fw.close();
    }

}
