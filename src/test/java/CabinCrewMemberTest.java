import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
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

    @Test
    public void canTalkToPassengers(){
        assertEquals("We're about to go past The Death Star.", anakin.talk());
    }
}
