package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(chooseString("rt","b","t"));
    }

    public static void sample1(){
        int a = 3;
        System.out.println(a);

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(input);
    }

    public static void sample2(){
        int a = 3;
        int b = 5;

        String c = "abc";
        //if(a == 4 && b == 5){
        //if(a == 4 || b == 5){
        if(c.equals("abc")){
            System.out.println("Viii!");
        }else if(c.equals("bca")){

        }
        else if(c.equals("bca2")){

        }
        else{

        }

        switch(c){
            case "abc":
                System.out.println("Viii!");
                break;
            case "bca":
                System.out.println("Viii2");
                break;
            default:
                System.out.println("aaa");
                break;
        }
    }

    public static int sample3(int a, int b){
        return a + b;
    }

    public static String chooseString(String a, String b, String c){
        
        StringBuilder newABC = new StringBuilder();
        newABC.append(a+b+c);

        if(newABC.length() > 5 ){
            return newABC.toString();
        } else {
            return newABC.reverse().toString();
        }
    }
}
