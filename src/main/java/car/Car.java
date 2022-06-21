package car;

public abstract class Car {

    private String make;
    private String colour;
    private double price;
    private Engine engine;

    public Car(String make, String colour, double price, Engine engine) {
        this.make = make;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
    }

    public String getMake() {
        return this.make;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return this.engine;
    }
}
