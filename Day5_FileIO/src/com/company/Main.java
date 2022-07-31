package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FileHandler handler = new FileHandler("test.txt");

        String text = handler.readAll();
        String[] textArr = text.split("\n");

        for(int i = 0; i < textArr.length; i++){
            System.out.println(textArr[i]);
        }


//        handler.writeFile("\nbbbb");


    }

    public static void trySample(){
        // write your code here
        Scanner sc = new Scanner(System.in);

        int a = 0;
        try{
            a = sc.nextInt();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
