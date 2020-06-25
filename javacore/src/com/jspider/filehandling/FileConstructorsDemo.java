package com.jspider.filehandling;

import java.io.File;

public class FileConstructorsDemo {

    public static void main(String[] args) {
        File f1=new File(String name);//name=file name or directory name
        
        File f2=new File(String subdir, String name);
        
        File f3=new File(File subdir,String name);

    }

}
