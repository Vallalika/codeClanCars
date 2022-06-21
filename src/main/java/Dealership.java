import car.Car;

import java.util.ArrayList;
import java.util.Collection;

public class Dealership {

    private String name;
    private double till;
    private ArrayList<Car> vehicleStock;

    public Dealership(String name, double till) {
        this.name = name;
        this.till = till;
        this.vehicleStock = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public double getTill() {
        return this.till;
    }

    public ArrayList<Car> getVehicleStock() {
        return this.vehicleStock;
    }

    public void buyVehicle(Car car) {
        this.vehicleStock.add(car);
        this.till -= car.getPrice();
    }

    public void sellVehicle(Car car, Customer customer) {
        this.vehicleStock.remove(car);
        this.till += car.getPrice();
        customer.buyVehicle(car);
    }
}
