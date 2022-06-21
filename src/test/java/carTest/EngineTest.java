package carTest;

import car.Engine;
import car.EngineType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(EngineType.ELECTRIC);
    }

    @Test
    public void hasType() {
        assertEquals(EngineType.ELECTRIC,engine.getType());
    }

}