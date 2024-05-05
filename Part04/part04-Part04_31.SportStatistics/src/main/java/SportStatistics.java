
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    
    // This exercise is divided in two parts
    // Part01.Games Played
    // Part02.Wins and Losses

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int wins = 0, losses = 0;
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        ArrayList<Teams> data = readFromFile(file);
        for(Teams t : data) {
            if(t.getHomeTeam().contains(team)) {
                count++;
                
                if(t.getHomeTeamPoints() > t.getVsTeamPoints()) {
                    wins++;
                }else{
                    losses++;
                }
            }else if(t.getVisitingTeam().contains(team)) {
                count++;
                
                if(t.getVsTeamPoints() > t.getHomeTeamPoints()) {
                    wins++;
                }else{
                    losses++;
                }
            }   
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Teams> readFromFile(String file) {
        ArrayList<Teams> teams = new ArrayList<>();
        
        try(Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] parts = line.split(",");
             
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int vsTeamPoints = Integer.valueOf(parts[3]);
                
                teams.add(new Teams(homeTeam, visitingTeam, homeTeamPoints, vsTeamPoints));
            }
        
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return teams;
    }
}