import java.util.ArrayList;

public class Flight {
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;
    private ArrayList<Pilot> pilotList;
    private ArrayList<CabinCrewMember> cabinCrewMemberList;
    private ArrayList<Passenger> passengerList;
    private PlaneType assignedPlane;

    public Flight(String flightNumber, AirportsList destinationAirport, AirportsList departureAirport, String departureTime, PlaneType assignedPlane) {
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport.getAirport();
        this.departureAirport = departureAirport.getAirport();
        this.departureTime = departureTime;
        this.pilotList = new ArrayList<>();
        this.cabinCrewMemberList = new ArrayList<>();
        this.passengerList = new ArrayList<>();
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

    public PlaneType getAssignedPlane() {
        return this.assignedPlane;
    }

    public String getPlaneModel(){
        return this.assignedPlane.getModel();
    }

    public double getPassengerCapacity(){
        return this.assignedPlane.getPassengerCapacity();
    }

    public double getBaggageCapacity(){
        return this.assignedPlane.getBaggageCapacity();
    }

    public double getSeatsRemaining(){
        return this.getPassengerCapacity() - getPassengerListSize();
    }

    public double getBaggageAllowancePerPassenger(){
        return this.assignedPlane.getBaggageAllowance();
    }

    public double getBaggageAllowanceRemaining(){
        return this.assignedPlane.getBaggageCapacity() - (this.getBaggageAllowancePerPassenger() * this.getPassengerListSize());
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

    public ArrayList getListOfPilots(){
        return this.pilotList;
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

    public ArrayList getListOfCabinCrewMembers() {
        return cabinCrewMemberList;
    }

    public void addPassenger(Passenger passenger){
        if(getPassengerListSize() < this.getPassengerCapacity())
        this.passengerList.add(passenger);
    }

    public void removePassenger(Passenger passenger){
        this.passengerList.remove(passenger);
    }

    public int getPassengerListSize() {
        return this.passengerList.size();
    }

    public ArrayList getListOfPassengers() {
        return passengerList;
    }


//    public void add(ArrayList array, Object object){
//        array.add(object);
//    }

//    public int getListSize(ArrayList array) {
//        return array.size();
//    }

//    public void remove(ArrayList array, Object object) {
//        array.remove(object);
//    }



}
