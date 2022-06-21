import car.Car;

import java.util.ArrayList;
import java.util.Collection;

public class Customer {

    private String name;
    private double wallet;
    private ArrayList<Car>  vehicleCollection;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
        this.vehicleCollection = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public ArrayList<Car> getVehicleCollection() {
        return this.vehicleCollection;
    }

    public void buyVehicle(Car car) {
        this.vehicleCollection.add(car);
        this.wallet -= car.getPrice();
    }
}
