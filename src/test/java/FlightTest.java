import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
    ArrayList pilotList;
    ArrayList cabinCrewMemberList;
    ArrayList passengerList;

    @Before
    public void setUp(){
        flight  = new Flight("POI098", AirportsList.LHR, AirportsList.EDI, "06:00");
        yoda    = new Pilot("Yoda", CrewMemberRank.PILOT, "ABC123" );
        chewbacca = new Pilot("Chewbacca", CrewMemberRank.PILOT, "DEF123");
        r2d2 = new CabinCrewMember("R2D2", CrewMemberRank.FLIGHTMANAGER);
        k2so = new CabinCrewMember("K2SO", CrewMemberRank.FLIGHTATTENDANT);
        c3po = new CabinCrewMember("C3PO", CrewMemberRank.FLIGHTATTENDANT);
        anakin  = new Passenger("Anakin", 1);
        luke    = new Passenger("Luke", 2);
        darthVader  = new Passenger("Darth Vader", 4);
        marsRover   = new Plane("Mars Rover", 2, 2);
        pilotList           = new ArrayList<Pilot>(flight.getListOfPilots());
        cabinCrewMemberList = new ArrayList<CabinCrewMember>(flight.getListOfCabinCrewMembers());
        passengerList       = new ArrayList<Passenger>(flight.getListOfPassengers());

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

    @Test
    public void pilotListStartsEmpty() {
        assertEquals(0, flight.getListSize(pilotList));
    }
    @Test
    public void canAddPilots() {
        flight.add(pilotList, yoda);
        flight.add(pilotList, chewbacca);
        assertEquals(2, flight.getListSize(pilotList));
    }

    @Test
    public void crewMemberListStartsEmpty() {
        assertEquals(0, flight.getListSize(cabinCrewMemberList));
    }
//
//    @Test
//    public void canAddCrewMembers() {
//    }
//
    @Test
    public void passengerListStartsEmpty() {
        assertEquals(0, flight.getListSize(passengerList));
    }
//
//    @Test
//    public void canAddPassengers() {
//    }
//
//    @Test
//    public void hasPlaneAssigned() {
//    }
}
