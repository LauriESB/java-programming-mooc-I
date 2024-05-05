/**
 *
 * @author LauriESB
 */
public class Teams {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int vsTeamPoints;
    
    public Teams(String homeTeam, String visitingTeam, int homeTeamPoints, int vsTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.vsTeamPoints = vsTeamPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getHomeTeamPoints() {
        return homeTeamPoints;
    }

    public int getVsTeamPoints() {
        return vsTeamPoints;
    }
    public String toString() {
        return "s";
    }
}
