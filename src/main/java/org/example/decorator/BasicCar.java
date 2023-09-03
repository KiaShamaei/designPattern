package org.example.decorator;

public class BasicCar implements Car{
    @Override
    public void assemble() {
        System.out.println("this is from basic car ...");
    }
}
