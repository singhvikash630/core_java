package com.jspider.filehandling;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FileDisplayDirectoryContentsDemo {

    public static void main(String[] args) {
        int count=0;
        long weekAgo = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(107);
        File f=new File("D:\\MS Office 2016 64 Bit");
        String[] s=f.list();
       /* File[] s=f.listFiles();
        for (File s1 : s) {
            if(s1.lastModified() >= weekAgo){
                if (s1.isFile()) {
                    count++;        
                    System.out.println(s1);
                }                
            }
        }
        System.out.println("count:"+count);*/
        for (String s1 : s) {
            File f1=new File(f,s1);
            if(f1.lastModified() >= weekAgo){
                if (f1.isFile()) {
                    count++;        
                    System.out.println(s1);
                }                
            }
        }
        System.out.println("count:"+count);
    }

}
