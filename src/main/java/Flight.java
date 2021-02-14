import java.util.ArrayList;
import java.util.HashMap;

public class Flight {
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Pilot> pilotList;
    private ArrayList<CabinCrewMember> cabinCrewMemberList;
    private ArrayList<Passenger> passengerList;
    private Object assignedPlane;

    public Flight(String flightNumber, AirportsList destinationAirport, AirportsList departureAirport, String departureTime) {
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport.getAirport();
        this.departureAirport = departureAirport.getAirport();
        this.departureTime = departureTime;
        this.pilotList = new ArrayList<Pilot>();
        this.cabinCrewMemberList = new ArrayList<CabinCrewMember>();
        this.passengerList = new ArrayList<Passenger>();
        this.assignedPlane = assignedPlane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public ArrayList getListOfCabinCrewMembers() {
        return cabinCrewMemberList;
    }

    public ArrayList getListOfPassengers() {
        return passengerList;
    }

    public ArrayList getListOfPilots(){
        return this.pilotList;

    }
    public void add(ArrayList array, Object object){
        array.add(object);
    }

    public int getListSize(ArrayList array) {
        return array.size();
    }
}
