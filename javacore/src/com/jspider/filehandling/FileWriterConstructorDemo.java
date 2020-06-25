package com.jspider.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterConstructorDemo {

    public static void main(String[] args) throws IOException {
        File f=new File("Demo2.txt");
        //use to override the contents
        FileWriter fw1=new FileWriter("Demo2.txt");
        FileWriter fw2=new FileWriter(f);
        
        //use to append the contents
        FileWriter fw3=new FileWriter("Demo2.txt",true);
        FileWriter fw4=new FileWriter(f,false);
    }

}
