import car.Car;
import car.ElectricCar;
import car.Engine;
import car.EngineType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private Car electricCar;
    private Car hybridCar;
    private Engine engine;
    private Customer customer;


    @Before
    public void before() {
        engine = new Engine (EngineType.ELECTRIC);
        dealership = new Dealership("CodeClanDealership",200000);
        electricCar = new ElectricCar("BMW","pink",50000,engine);
        customer = new Customer("Phil",100000);

    }

    @Test
    public void canGetName() {
        assertEquals("CodeClanDealership",dealership.getName());
    }

    @Test
    public void canGetTill() {
        assertEquals(200000,dealership.getTill(),0.00);
    }

    @Test
    public void startsWithNoStock() {
        assertEquals(0,dealership.getVehicleStock().size());
    }

    @Test
    public void hasStock() {
        dealership.getVehicleStock().add(electricCar);
        dealership.getVehicleStock().add(hybridCar);
        assertEquals(2,dealership.getVehicleStock().size());
    }

    @Test
    public void canBuyVehicle() {
        dealership.buyVehicle(electricCar);
        assertEquals(1,dealership.getVehicleStock().size());
        assertEquals(150000,dealership.getTill(),0.00);
    }

    @Test
    public void canSellVehicleToCustomer() {
        dealership.getVehicleStock().add(electricCar);
        dealership.sellVehicle(electricCar,customer);
        assertEquals(0,dealership.getVehicleStock().size());
        assertEquals(250000,dealership.getTill(),0.00);
        assertEquals(1,customer.getVehicleCollection().size());
        assertEquals(50000,customer.getWallet(), 0.00);

    }

}
