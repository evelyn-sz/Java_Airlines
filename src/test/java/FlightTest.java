import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot yoda;
    Pilot chewbacca;
    CabinCrewMember r2d2;
    CabinCrewMember k2so;
    CabinCrewMember c3po;
    Passenger anakin;
    Passenger luke;
    Passenger darthVader;
    Plane marsRover;

    @Before
    public void setUp(){
        flight = new Flight("POI098", AirportsList.LHR, AirportsList.EDI, "06:00");
    }

    @Test
    public void flightHasNumber(){
        assertEquals("POI098", flight.getFlightNumber());
    }

    @Test
    public void hasDestinationAirport() {
        assertEquals("London Heathrow", flight.getDestinationAirport());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("06:00", flight.getDepartureTime());
    }
}
