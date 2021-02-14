public enum AirportsList {
    GLA("Glasgow International"),
    PIK("Glasgow Prestwick"),
    LHR("London Heathrow"),
    LTN("London Luton"),
    EDI("Edinburgh");

    private final String airport;

    AirportsList(String airport){
        this.airport = airport;
    }

    public String getAirport(){
        return this.airport;
    }
}
