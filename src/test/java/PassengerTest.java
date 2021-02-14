import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger luke;

    @Before
    public void setUp(){
        luke = new Passenger("Luke", 1);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Luke", luke.getName());
    }

    @Test
    public void passengerHasLuggage(){
        assertEquals(1, luke.getNumberOfBags());
    }
}
