package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task3();
    }

    public static void sample1(){
        //for (foreach), while, do..while
        for(int i = 5; i < 11; i++){ //i=i+1, i+=2
            System.out.println(i);
        }
        ;
        for(int i = 5; i > 0; i--){
            System.out.println(i);
        }

    }

    public static void sample2(){
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("exit")){
            System.out.println("vii");
            input = sc.nextLine();
        }

        do{
            System.out.println("vii");
            input = sc.nextLine();
            if(input.equals("aaa")){
                break;
            }
        }while(!input.equals("exit"));
    }


    public static void sample3(){
        int a = 3;
        String b = String.valueOf(a);
        int c = Integer.parseInt(b);

    }

    public static void task3(){
        int triesAllowed = 6;
        String nameToGuess;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to guess:");
        nameToGuess = sc.nextLine();

        while(triesAllowed > 0){

            System.out.println("Guess word: ");
            if (sc.nextLine().equals(nameToGuess)){
                System.out.println("You won!");
                return;
            } else{
                triesAllowed--;
            }
        }
        System.out.println("You lost!");
    }
}
