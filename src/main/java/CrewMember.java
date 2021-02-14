public abstract class CrewMember {
    private String name;
    CrewMemberRank crewMemberRank;

    public CrewMember(String name, CrewMemberRank crewMemberRank){
        this.name = name;
        this.crewMemberRank = crewMemberRank;
    }

}
