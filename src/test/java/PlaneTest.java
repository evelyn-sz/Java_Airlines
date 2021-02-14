import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane("Mars Rover", 2, 4);
    }

    @Test
    public void hasName() {
        assertEquals("Mars Rover", plane.getModel());
    }

    @Test
    public void hasPassengerCapacity() {
        assertEquals(2, plane.getPassengerCapacity());
    }

    @Test
    public void hasBaggageCapacity() {
        assertEquals(4, plane.getBaggageCapacity());
    }
}
