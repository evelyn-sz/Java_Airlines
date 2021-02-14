import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.MARSROVER);
    }

    @Test
    public void hasName() {
        assertEquals("Mars Rover", plane.getModelFromEnum());
    }

    @Test
    public void hasPassengerCapacity() {
        assertEquals(2, plane.getPassengerCapacityFromEnum());
    }

    @Test
    public void hasBaggageCapacity() {
        assertEquals(2, plane.getBaggageCapacityFromEnum());
    }
}
