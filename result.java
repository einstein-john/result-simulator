import java.util.Random;
import java.util.Scanner;

public class GuessTheScore {

    public static void printResult(int scrT1, int scrT2, String team_1, String team_2) {
        System.out.println("===============[ THE RESULT OF THE MATCH  ]===============");
        System.out.println();
        System.out.println(team_1 + "->" + scrT1 + " <---> " + team_2 + "->" + scrT2);
    }

    public static void main(String[] args) {
        int scrT1, scrT2;
        String team_1, team_2;
        System.out.println("===============[ GUESS THE SCORE ]===============");
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the first team: ");
        team_1 = scanner.nextLine();
        System.out.println();
        
        System.out.print("Enter the name of the second team: ");
        team_2 = scanner.nextLine();
        System.out.println();
        
        Random rand = new Random();
        scrT1 = rand.nextInt(10) + 1; // generates a random for team 1 (between 1 and 10)
        scrT2 = rand.nextInt(10) + 2; // generates a random for team 2 (between 1 and 10)

        if (!team_1.isEmpty() && !team_2.isEmpty()) {
            printResult(scrT1, scrT2, team_1, team_2); // print result
        } // checks if team name is empty

        scanner.close();
    }
}
