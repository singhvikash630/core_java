package com.jspider.jdk8.lamdas;

public class RunnableDemo {

    public static void main(String[] args) {
        Thread myThread=new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Printed inside Runnable");

            }
        });
        myThread.run();

        Runnable r2=()->System.out.println("Thread2 is running...");  
         
        Thread t2=new Thread(r2);  
        t2.start(); 
    }

}
