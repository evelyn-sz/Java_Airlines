public class Pilot extends CrewMember{

    private String licenseNumber;
    public Pilot(String name, CrewMemberRank crewMemberRank, String licenseNumber) {
        super(name, crewMemberRank);
        this.licenseNumber = licenseNumber;

    }

    public String getLicenseNumber() {
        return this.licenseNumber;
    }

    public String fly(){
        return "Whizzz";
    }
}
