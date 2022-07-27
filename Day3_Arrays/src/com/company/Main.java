package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task2();
    }

    public static void sample1(){
        String[] arr = new String[4];
        arr[0] = "aaa";

        int[] arr2 = {12,1234,546,123,56,11};

        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }

    public static void sample2(){
        List<String> lst = new ArrayList<>();

        lst.add("aa");
        lst.add("bb");
        lst.add("dd");

        lst.set(0, "cc");
        lst.remove(0);

        for(int i = 0; i < lst.size(); i++){
            System.out.println(lst.get(i));
        }

        System.out.println("-----------------");

        for(String el:lst){
            System.out.println(el);
        }

        List<Integer> intLst = new ArrayList<>();
        intLst.add(2);
        intLst.add(4);
        intLst.add(56);

        int sum = 0;

        for(int el:intLst){
            sum+=el;
        }

        System.out.println(sum);
    }

    public  static void task2(){
        Scanner sc = new Scanner(System.in);
        List<String> wordList = new ArrayList<>();
        System.out.println("Enter how many words you want to add: ");
        int listSize = sc.nextInt();

        for (int i = 0; i < listSize; i++){
            wordList.add(sc.next());
        }

        String replace = "...";


        for (int i = 0; i < wordList.size(); i++){
            if (wordList.get(i).length() < 5){
                wordList.set(i, replace);
            }
        }

        System.out.println("\n");

        for (String word: wordList){
            System.out.println(word);
        }

    }
}
