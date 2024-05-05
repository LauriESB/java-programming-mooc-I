
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        ArrayList<String> teams = new ArrayList<>();
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while(scanFile.hasNextLine()) {
                teams.add(scanFile.nextLine());
                
                String row = scanFile.nextLine();
                
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int vsTeamPoints = Integer.valueOf(parts[3]);
                
                for(String p : parts) {
                    if(homeTeam == team || visitingTeam == team) {
                        count++;
                    }else {
                        continue;
                    }
                }
                
                
            }
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + count);
    }

}
