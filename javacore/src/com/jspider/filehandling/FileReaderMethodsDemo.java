package com.jspider.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMethodsDemo {

    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("Demo2.txt");
       fr.read();//read character wise and return unicode value
       
       Char[] ch=new Char[100];
       fr.read(ch);//return the length of the array size
       
       fr.close();//close the FR object

    }

}
