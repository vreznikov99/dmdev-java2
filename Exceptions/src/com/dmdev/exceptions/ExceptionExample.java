package com.dmdev.exceptions;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            unsafe(10);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main end");

    }

    public static void unsafe(int value) throws TimeoutException, FileNotFoundException{
        System.out.println("unsafe start");
        if(value > 0){
            throw new FileNotFoundException();
        }
        System.out.println("unsafe end");
    }
}
