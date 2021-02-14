public class CabinCrewMember extends CrewMember {
    public CabinCrewMember(String name, CrewMemberRank crewMemberRank) {
        super(name, crewMemberRank);
    }

    public String talk(){
        return "We're about to go past The Death Star.";
    }
}
