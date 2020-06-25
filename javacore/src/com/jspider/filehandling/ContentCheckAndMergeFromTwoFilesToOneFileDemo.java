package com.jspider.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ContentCheckAndMergeFromTwoFilesToOneFileDemo {

    public static void main(String[] args) throws IOException {

        PrintWriter pw=new PrintWriter("file.txt");
        BufferedReader br1=new BufferedReader(new FileReader("Demo2.txt"));
        

        String line=br1.readLine();        
        
        while (line != null) {
            boolean available=false;
            BufferedReader br2=new BufferedReader(new FileReader("Demo3.txt"));
            String target=br2.readLine();  
            while(target != null){
                if (line.equals(target)) {
                    available=true;
                    break;
                }
                target=br2.readLine();
            }
            if(available == false) {                
                pw.println(line);
            } 
            line=br1.readLine();  
        }
        pw.flush();
        pw.close();
        br1.close();
         

    }

}
