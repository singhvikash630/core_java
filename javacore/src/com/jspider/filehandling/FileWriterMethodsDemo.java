package com.jspider.filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMethodsDemo {

    public static void main(String[] args) throws IOException {
        FileWriter fw1=new FileWriter("Demo2.txt");
        
       fw1.write('a');//to write a single character
        
       fw1.write(char[] ch);//to write array of characters
        
       fw1.write(String s);//to write string to the file
        
       fw1.flush();//to give the guarntee that total data transfer to the file.
        
       fw1.close();    

    }

}
