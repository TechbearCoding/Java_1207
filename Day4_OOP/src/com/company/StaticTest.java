package com.company;

public class StaticTest {

    private static void test1(){
        System.out.println("test1");
    }

    public static void test2(){
        System.out.println("test2");
        test1();
    }
}
