package com.jspider.filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {
      //it won't create any physical file,if abc.txt is present then f1 will point to that
        File f1=new File("abc.txt");
        System.out.println(f1.exists());
        
        //it will create new file
        f1.createNewFile();
        System.out.println(f1.exists());
        
        //it will create directory
        File f2=new File("vikash123");
        f2.mkdir();        
        System.out.println(f2.getAbsolutePath());
        
        //create abc.txt file in vikash123 folder
        File f3=new File("vikash123","abc.txt");
        
        //create abc.txt file in vikash123 folder
        File f4=new File(f2,"abc.txt");
        f4.createNewFile();
        
        //create abc.txt file in E://xyz folder,folder should be present in our system
        File f5=new File("D://xyz","abc.txt");
        f5.createNewFile();
        
        

    }

}
