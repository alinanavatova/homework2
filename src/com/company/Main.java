package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Toyota");
        createObject("Mercedes");
        createObject("Bmw");
    }
    public static void createObject(String className){
        switch (className){
            case "Toyota":
                Toyota toyota = new Toyota("Toyota", "Camry", 2016, "black", 735000);
                toyota.print();
                break;
            case "Mercedes":
                Mercedes mercedes = new Mercedes("Mercedes", "GLA", 2020, "Grey", 5830000);
                mercedes.print();
                break;
            case "Bmw":
                Bmw bmw = new Bmw("Bmw", "1 series", 2013, "blue", 2330000);
                bmw.print();
                break;
        }
    }
}
