package carTest;

import car.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

        private Car myElectricCar;
        private Engine engine;

        @Before
        public void before() {
            engine = new Engine(EngineType.ELECTRIC);
            myElectricCar = new ElectricCar("Tesla","red", 50000, engine);
        }

        @Test
        public void canGetMake() {
            assertEquals("Tesla", myElectricCar.getMake());
        }

        @Test
        public void canGetPrice() {
            assertEquals(50000, myElectricCar.getPrice(),0.00);
        }

        @Test
        public void canGetColour() {
            assertEquals("red", myElectricCar.getColour());
        }

        @Test
        public void canGetEngine() {
            assertEquals(engine, myElectricCar.getEngine());
        }
    }
