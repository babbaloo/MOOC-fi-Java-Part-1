
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String filename = scan.nextLine();
        
        ArrayList<String> homeTeam = homeTeamFromFile(filename);
        ArrayList<String> awayTeam = awayTeamFromFile(filename);
                
        System.out.println("Team:");
        String userTeam = scan.nextLine();
        int teamGames = 0;
        for (String teamHome : homeTeam) {
            if (teamHome.equals(userTeam)) {
                teamGames++;
            }
        }
        for (String teamAway : awayTeam) {
            if (teamAway.equals(userTeam)) {
                teamGames++;
            }
        }
        int wins = 0;
        for (int i = 0; i < awayTeam.size(); i++){
            if (homeTeam.get(i).equals(userTeam) && Integer.valueOf(homeTeam.get(i + 1)) > Integer.valueOf(awayTeam.get(i + 1))) {
                wins++;
            }
            if (awayTeam.get(i).equals(userTeam) && Integer.valueOf(awayTeam.get(i + 1)) > Integer.valueOf(homeTeam.get(i + 1))) {
                wins++;
            }
        }
        System.out.println("Games: " + teamGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (teamGames - wins));
        
        


    }
    
    public static ArrayList<String> homeTeamFromFile(String file) {
        ArrayList<String> home = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                if (row.equals("")) {
                    continue;
                }
                String[] eachValueOnRow = row.split(",");
                home.add(eachValueOnRow[0]);
                home.add(eachValueOnRow[2]);
                
                
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return home;
    }
    
    public static ArrayList<String> awayTeamFromFile(String file) {
        ArrayList<String> away = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                if (row.equals("")) {
                    continue;
                }
                String[] eachValueOnRow = row.split(",");
                away.add(eachValueOnRow[1]);
                away.add(eachValueOnRow[3]);
                
                
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return away;
    }

}
