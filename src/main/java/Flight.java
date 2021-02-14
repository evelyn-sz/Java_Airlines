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
    private PlaneType assignedPlane;
    private int passengerCapacity;
    private int baggageCapacity;

    public Flight(String flightNumber, AirportsList destinationAirport, AirportsList departureAirport, String departureTime, PlaneType assignedPlane) {
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport.getAirport();
        this.departureAirport = departureAirport.getAirport();
        this.departureTime = departureTime;
        this.pilotList = new ArrayList<Pilot>();
        this.cabinCrewMemberList = new ArrayList<CabinCrewMember>();
        this.passengerList = new ArrayList<Passenger>();
        this.assignedPlane = assignedPlane;

//        this.passengerCapacity = assignedPlane.getPassengerCapacity();
//        this.baggageCapacity = assignedPlane.getBaggageCapacity();
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

    public PlaneType getAssignedPlane() {
        return this.assignedPlane;
    }

    public String getPlaneModelFromEnum(){
        return this.assignedPlane.getModel();
    }

    public int getPassengerCapacityFromEnum(){
        return this.assignedPlane.getPassengerCapacity();
    }

    public int getBaggageCapacityFromEnum(){
        return this.assignedPlane.getBaggageCapacity();
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


//    public void add(ArrayList array, Object object){
//        array.add(object);
//    }

    public int getListSize(ArrayList array) {
        return array.size();
    }

//    public void remove(ArrayList array, Object object) {
//        array.remove(object);
//    }

    public int getSeatsRemaining(){
        return this.getPassengerCapacityFromEnum() - getPassengerListSize();
    }

    public void addPilot(Pilot pilot) {
        this.pilotList.add(pilot);
    }

    public void removePilot(Pilot pilot){
        this.pilotList.remove(pilot);
    }

    public int getPilotListSize(){
        return this.pilotList.size();
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember){
        this.cabinCrewMemberList.add(cabinCrewMember);
    }

    public void removeCabinCrewMember(CabinCrewMember cabinCrewMember){
        this.cabinCrewMemberList.remove(cabinCrewMember);
    }

    public int getCabinCrewMemberListSize() {
        return this.cabinCrewMemberList.size();
    }

    public void addPassenger(Passenger passenger){
        this.passengerList.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.passengerList.remove(passenger);
    }

    public int getPassengerListSize() {
        return this.passengerList.size();
    }


}
