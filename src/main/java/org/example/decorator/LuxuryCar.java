package org.example.decorator;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("this is from Luxury car add ...");
    }
}
