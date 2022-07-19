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
        newABC.append(a).append(b).append(c);

        if(newABC.length() > 5 ){
            return newABC.toString();
        } else {
            return newABC.reverse().toString();
        }
    }

    public static void checkDate(int a){
        switch (a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Incorrect value!");
        }
    }

}
