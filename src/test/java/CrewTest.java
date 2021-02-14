import org.junit.Before;

public class CrewTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void setUp(){
        cabinCrewMember = new CabinCrewMember("Anakin", CrewMemberRank.FLIGHTATTENDANT);
    }
}
