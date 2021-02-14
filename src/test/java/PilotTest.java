import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest{
    Pilot yoda;

    @Before
    public void setUp() {
        yoda = new Pilot("Yoda", CrewMemberRank.PILOT, "ABC123");
    }

    @Test
    public void hasName() {
        assertEquals("Yoda", yoda.getName());
    }

    @Test
    public void hasRank() {
        assertEquals("Pilot", yoda.getRankFromEnum());
    }

    @Test
    public void hasLicenseNumber() {
        assertEquals("ABC123", yoda.getLicenseNumber());
    }

    @Test
    public void pilotCanFlu(){
        assertEquals("Whizzz", yoda.fly());
    }

}
