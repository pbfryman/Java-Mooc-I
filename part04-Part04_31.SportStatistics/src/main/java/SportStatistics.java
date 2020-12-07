
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        ArrayList<Game> records = readRecordsFromFile(file);
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        for (Game game : records) {
            if (game.getAway().equals(team) && game.getAwayScore() > game.getHomeScore()) {
                wins++;
                games++;
            } else if (game.getAway().equals(team) && game.getAwayScore() < game.getHomeScore()) {
                losses++;
                games++;
            } else if (game.getHome().equals(team) && game.getHomeScore() > game.getAwayScore()) {
                wins++;
                games++;
            } else if (game.getHome().equals(team) && game.getHomeScore() < game.getAwayScore()) {
                losses++;
                games++;
            }
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<Game> readRecordsFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
        
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                String[] parts = line.split(",");
                String home = parts[0];
                String away = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);
                games.add(new Game(home, away, homeScore, awayScore));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return games;
    }

}
