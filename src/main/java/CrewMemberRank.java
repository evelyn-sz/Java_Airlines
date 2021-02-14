public enum CrewMemberRank {
    FLIGHTATTENDANT("Flight Attendant"),
    PILOT("Pilot"),
    FLIGHTMANAGER("Flight Manager");

    private final String rank;

    CrewMemberRank(String rank) {
        this.rank = rank;
    }

    public String getRank(){
        return this.rank;
    }
}
