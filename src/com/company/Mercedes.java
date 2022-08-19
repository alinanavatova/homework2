package com.company;

public class Mercedes extends Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int price;

    public Mercedes(String brand, String model, int year, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("Марка - " + brand +
                "\nМодель - " + model +
                "\nГод - " + year +
                "\nЦвет - " + color +
                "\nЦена - " + price);
    }
}
