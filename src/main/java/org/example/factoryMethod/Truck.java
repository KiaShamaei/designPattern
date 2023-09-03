package org.example.factoryMethod;

public class Truck implements Logistics{
    @Override
    public void transport() {
        System.out.println(" transport by Truck ...");;
    }
}
