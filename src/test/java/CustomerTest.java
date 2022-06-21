import car.Car;
import car.ElectricCar;
import car.Engine;
import car.EngineType;
import org.junit.Before;
import org.junit.Test;

import javax.smartcardio.Card;

import static org.junit.Assert.*;

public class CustomerTest {

    private Customer customer;
    private Car tesla;
    private Car bmw;
    private Engine engine;

    @Before
    public void before() {
        customer = new Customer("Val",150000);
        engine = new Engine(EngineType.ELECTRIC);
        tesla = new ElectricCar("Tesla","red", 40000, engine);
        bmw = new ElectricCar("BMW","pink",50000,engine);
    }

    @Test
    public void hasName() {
        assertEquals("Val", customer.getName());
    }

    @Test
    public void hasWallet() {
        assertEquals(150000, customer.getWallet(),0.00);
    }

    @Test
    public void startsWithVehicleCollection() {
        assertEquals(0,customer.getVehicleCollection().size());
    }

    @Test
    public void canBuyVehicle() {
        customer.buyVehicle(bmw);
        assertEquals(1,customer.getVehicleCollection().size());
        assertEquals(100000,customer.getWallet(),0.00);
    }
}