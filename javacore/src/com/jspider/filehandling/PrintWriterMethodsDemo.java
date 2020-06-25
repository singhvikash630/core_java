package com.jspider.filehandling;

import java.io.PrintWriter;

public class PrintWriterMethodsDemo {

    public static void main(String[] args) {
        PrintWriter pw=new PrintWriter("abc.txt");
        
        //same as FileWriter and BuffreadWriter
        pw.write('a');//to write a single character
        
        pw.write(char[] ch);//to write array of characters
         
        pw.write(String s);//to write string to the file
         
        pw.flush();//to give the guarntee that total data transfer to the file.
         
        pw.close(); 
        
        //Extra method
        pw.print(char ch);
        pw.print(int i);
        pw.print(String s);
        pw.print(boolean b);
        pw.print(double d);        
        ;;;;;;;;;;;;;;;;;;;;        
        pw.println(char ch);
        pw.println(int i);
        pw.println(String s);
        pw.println(boolean b);
        pw.println(double d); 
        
        
        

    }

}
