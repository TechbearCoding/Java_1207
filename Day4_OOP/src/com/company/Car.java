package com.company;

public class Car {
    //public, private
    private String color;

    public Car(String color){
        setColor(color);
    }

    public Car(){
        color = "blank";
    }

    public void setColor(String color){
        if(color.equals("Black")){
            this.color = "White";
        }else{
            this.color = color;
        }
    }

    public String getColor(){
        return color;
    }

    public void drive(){
        System.out.println("Vroom, vroom");
    }

    private void checkEngineLight(){
        System.out.println("All is ok");
    }

    public String toString(){
        return color;
    }
}
