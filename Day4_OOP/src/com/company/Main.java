package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    //StaticTest.test2();
        Car c1 = new Car();
        //c1.drive();

        Car c2 = new Car("White");
        System.out.println(c2);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("black"));
        carList.add(new Car("red"));

        for(int i = 0; i < carList.size(); i++){
            carList.get(i).setColor("white");
            System.out.println(carList.get(i));
        }
        //c2.drive();

        StaticTest.a = 3;
    }
}
