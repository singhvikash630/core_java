package com.jspider.exception;

public class CatchingErrorDemo {

    public static void main(String[] args) {
        try {
            System.out.println("try block");
            throw new OutOfMemoryError();
            

        } catch (Error e) {
            System.out.println("catch block");
        }

    }

}
