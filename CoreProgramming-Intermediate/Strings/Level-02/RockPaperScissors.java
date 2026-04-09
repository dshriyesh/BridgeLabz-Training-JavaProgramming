// Rock-Paper-Scissors is a game played between a minimum of two players. Each player can
// choose either rock, paper, or scissors. Here the game is played between a user and a
// computer. Based on the rules, either a player or a computer will win. Show the stats of
// player and computer win in a tabular format across multiple games. Also, show the winning
// percentage between the player and the computer.
// Hint =>
// a. The rule is: rock-scissors: rock will win (rock crushes scissors); rock-paper: paper wins
// (paper covers rock); scissors-paper: scissors win (scissors cuts paper)
// b. Create a Method to find the Computer Choice using the Math.random
// c. Create a Method to find the winner between the user and the computer
// d. Create a Method to find the average and percentage of wins for the user and the
// computer and return a String 2D array
// e. Create a Method to display the results of every game and also display the average and
// percentage wins
// f. In the main take user input for the number of games and call methods to display results


import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of turns: ");
        int turns = sc.nextInt();

        String[][] results = new String[turns][3]; // player, computer, winner

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < turns; i++) {

            System.out.print("Enter move ('r','p','s'): ");
            String player = sc.next();

            String computer = computerChoice();

            String winner = findWinner(player, computer);

            results[i][0] = player;
            results[i][1] = computer;
            results[i][2] = winner;

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            System.out.println("Player: " + player + " | Computer: " + computer);
            System.out.println("Winner: " + winner);
        }

        displayTable(results);

        double playerPercent = (playerWins * 100.0) / turns;
        double computerPercent = (computerWins * 100.0) / turns;

        System.out.println("\n--- Overall Stats ---");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);

        System.out.printf("Player Win %%: %.2f\n", playerPercent);
        System.out.printf("Computer Win %%: %.2f\n", computerPercent);

        if (playerWins > computerWins) {
            System.out.println("Overall Winner: Player 🎉");
        } else if (computerWins > playerWins) {
            System.out.println("Overall Winner: Computer 🤖");
        } else {
            System.out.println("It's a Draw 🤝");
        }

        sc.close();
    }

    public static String computerChoice() {
        String[] arr = {"r", "p", "s"};
        int index = (int) (Math.random() * 3);
        return arr[index];
    }

    public static String findWinner(String player, String computer) {

        if (player.equals(computer)) {
            return "Draw";
        }

        if (player.equals("r") && computer.equals("s") ||
            player.equals("p") && computer.equals("r") ||
            player.equals("s") && computer.equals("p")) {
            return "Player";
        }

        return "Computer";
    }

    public static void displayTable(String[][] results) {

        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t" +
                               results[i][1] + "\t\t" +
                               results[i][2]);
        }
    }
}