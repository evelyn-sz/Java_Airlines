import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrewMemberTest {
    CabinCrewMember anakin;

    @Before
    public void setUp(){
        anakin = new CabinCrewMember("Anakin", CrewMemberRank.FLIGHTATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Anakin", anakin.getName());
    }

    @Test
    public void hasRank() {
        assertEquals("Flight Attendant", anakin.getRankFromEnum());
    }
}
