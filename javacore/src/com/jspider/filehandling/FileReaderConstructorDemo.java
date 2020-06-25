package com.jspider.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class FileReaderConstructorDemo {

    public static void main(String[] args) throws FileNotFoundException {
       File f=new File("abc.txt");
       
       FileReader fw1=new FileReader("Demo2.txt");
       FileReader fw2=new FileReader(f);

    }

}
