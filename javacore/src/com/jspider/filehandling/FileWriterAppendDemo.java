package com.jspider.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAppendDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("Demo2.txt",true);       
        fw.write(100);
        fw.write("\n");
        fw.write("urgaSolutions");        
        fw.flush();
        fw.close();
    }

}
