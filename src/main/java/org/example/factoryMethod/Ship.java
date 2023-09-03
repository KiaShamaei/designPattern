package org.example.factoryMethod;

public class Ship implements Logistics{
    @Override
    public void transport() {
        System.out.println("transport by Ship ...");
    }
}
