package org.example.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        var car_custom= new CarClassic(new LuxuryCar(new BasicCar()));
        car_custom.assemble();
    }
}
