import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight2;
    Pilot yoda;
    Pilot chewbacca;
    CabinCrewMember r2d2;
    CabinCrewMember k2so;
    CabinCrewMember c3po;
    Passenger anakin;
    Passenger luke;
    Passenger darthVader;
    ArrayList pilotList;
    ArrayList cabinCrewMemberList;
    ArrayList passengerList;

    @Before
    public void setUp(){
        flight  = new Flight("POI098", AirportsList.LHR, AirportsList.EDI, "06:00", PlaneType.MARSROVER);
        flight2 = new Flight("LKJ098", AirportsList.GLA, AirportsList.LTN, "18:00", PlaneType.APOLLO13);
        yoda        = new Pilot("Yoda", CrewMemberRank.PILOT, "ABC123" );
        chewbacca   = new Pilot("Chewbacca", CrewMemberRank.PILOT, "DEF123");
        r2d2 = new CabinCrewMember("R2D2", CrewMemberRank.FLIGHTMANAGER);
        k2so = new CabinCrewMember("K2SO", CrewMemberRank.FLIGHTATTENDANT);
        c3po = new CabinCrewMember("C3PO", CrewMemberRank.FLIGHTATTENDANT);
        anakin      = new Passenger("Anakin", 1);
        luke        = new Passenger("Luke", 2);
        darthVader  = new Passenger("Darth Vader", 4);
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
    public void hasPlaneAssigned() {
        assertEquals(PlaneType.MARSROVER, flight.getAssignedPlane());
    }

    @Test
    public void pilotListStartsEmpty() {
        assertEquals(0, flight.getPilotListSize());
    }
    @Test
    public void canAddPilots() {
        flight.addPilot(yoda);
        flight.addPilot(chewbacca);
        assertEquals(2, flight.getPilotListSize());
    }

    @Test
    public void canRemovePilot() {
        flight.addPilot(yoda);
        flight.addPilot(chewbacca);
        flight.removePilot(yoda);
        assertEquals(1, flight.getPilotListSize());
    }

    @Test
    public void crewMemberListStartsEmpty() {
        assertEquals(0, flight.getCabinCrewMemberListSize());
    }

    @Test
    public void canAddCrewMembers() {
        flight.addCabinCrewMember(r2d2);
        flight.addCabinCrewMember(k2so);
        flight.addCabinCrewMember(c3po);
        assertEquals(3, flight.getCabinCrewMemberListSize());
    }

    @Test
    public void canRemoveCabinCrewMember() {
        flight.addCabinCrewMember(r2d2);
        flight.addCabinCrewMember(k2so);
        flight.addCabinCrewMember(c3po);
        flight.removeCabinCrewMember(r2d2);
        assertEquals(2, flight.getCabinCrewMemberListSize());
    }


    @Test
    public void passengerListStartsEmpty() {
        assertEquals(0, flight.getPassengerListSize());
    }

    @Test
    public void canAddPassengers() {
        flight.addPassenger(anakin);
        flight.addPassenger(luke);
        flight.addPassenger(darthVader);
        assertEquals(2, flight.getPassengerListSize());
    }

    @Test
    public void canRemovePassengerANDwontAddOverCapacity() {
        flight.addPassenger(anakin);
        flight.addPassenger(luke);
        flight.addPassenger(darthVader);
        flight.removePassenger(luke);
        assertEquals(1, flight.getPassengerListSize());
    }

    @Test
    public void planeHasModel(){
        assertEquals("Mars Rover", flight.getPlaneModel());
    }

    @Test
    public void planeHasPassengerCapacity() {
        assertEquals(2, flight.getPassengerCapacity());
    }

    @Test
    public void planeHasBaggageCapacity(){
        assertEquals(2, flight.getBaggageCapacity());
    }

    @Test
    public void showsSeatsRemaining() {
        flight.addPassenger(anakin);
        assertEquals(1, flight.getSeatsRemaining());
        flight2.addPassenger(luke);
        flight2.addPassenger(darthVader);
        assertEquals(1, flight2.getSeatsRemaining());
    }
}
