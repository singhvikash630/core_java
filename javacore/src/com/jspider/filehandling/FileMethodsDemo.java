package com.jspider.filehandling;

import java.io.File;
import java.io.IOException;

public class FileMethodsDemo {

    public static void main(String[] args) throws IOException {
        File f1=new File("abc.txt");
        f1.exists();//check file is available or not
        f1.createNewFile();//create new file
        f1.mkdir();//create new directory
        f1.isFile();//check f1 is pointing to file
        f1.isDirectory();//check f1 is pointing to directory
        f1.list();//display all files or subdirectory String[]
        f1.listFiles();//display all file names File[]
        f1.length();//display length of character that is long
        f1.delete();//delete the file or directory

    }

}
