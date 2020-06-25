package com.jspider.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderConstructorsDemo {

    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("Demo2.txt");
        FileReader fr1=new FileReader("Demo2.txt");
        FileReader fr2=new FileReader(f);
        
       

    }

}
