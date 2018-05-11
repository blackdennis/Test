package com.ichanyu.p1;

public class Hello {
    public static void main(String[] args) {
        System.out.println("GOGOGO!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
