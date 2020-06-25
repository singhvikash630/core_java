package com.jspider.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ContentMergeFromTwoFilesToOneFileAlternativeDemo {

    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter("file.txt");
        BufferedReader br1=new BufferedReader(new FileReader("Demo2.txt"));
        BufferedReader br2=new BufferedReader(new FileReader("Demo3.txt"));
        String line1=br1.readLine();
        String line2=br2.readLine();
        while ((line1 != null) || (line2 != null)) {
            if(line1 != null){
                pw.println(line1);
                line1=br1.readLine();
            }
            if(line2 != null){
                pw.println(line2);            
                line2=br2.readLine();
            } 
            
        }      
        
        pw.flush();
        pw.close();
        br1.close();
        br2.close();   

    }

}
