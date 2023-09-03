package org.example.factoryMethod;

public class LogisticFactory {
    public Logistics createLogistic(String type) {
        if (type == null || type.isEmpty())
            return null;
        var result = switch (type) {
            case "TRUCK" -> new Truck();
            case "SHIP" -> new Ship();
            default -> throw new IllegalArgumentException("Unknown channel " + type);
        };
        return result;
    }

}
