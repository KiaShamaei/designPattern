package org.example.decorator;

public class CarClassic extends CarDecorator {
    public CarClassic(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("this is from Classic car add ...");
    }
}
