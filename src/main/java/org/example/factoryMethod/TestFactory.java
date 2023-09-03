package org.example.factoryMethod;

public class TestFactory {
    public static void main(String[] args) {
        //call method from factory indirectly
        var factory = new LogisticFactory();
//        factory.createLogistic("TRUCK").transport();
        factory.createLogistic("SHIP").transport();

    }
}
