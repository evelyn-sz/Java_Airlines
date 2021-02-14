public class Flight {
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;

    public Flight(String flightNumber, AirportsList destinationAirport, AirportsList departureAirport, String departureTime) {
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport.getAirport();
        this.departureAirport = departureAirport.getAirport();
        this.departureTime = departureTime;
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
}
