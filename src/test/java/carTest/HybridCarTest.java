package carTest;

import car.Car;
import car.Engine;
import car.EngineType;
import car.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private Car myHybridCar;
    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(EngineType.HYBRID);
        myHybridCar = new HybridCar("Ford","black", 1000, engine);
    }

    @Test
    public void canGetMake() {
        assertEquals("Ford", myHybridCar.getMake());
    }

    @Test
    public void canGetPrice() {
        assertEquals(1000, myHybridCar.getPrice(),0.00);
    }

    @Test
    public void canGetColour() {
        assertEquals("black", myHybridCar.getColour());
    }

    @Test
    public void canGetEngine() {
        assertEquals(engine, myHybridCar.getEngine());
    }
}
