package carTest;

import car.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Test
    public void hasSize() {
        tyre = new Tyre(19);
        assertEquals(19,tyre.getSize());
    }
}
