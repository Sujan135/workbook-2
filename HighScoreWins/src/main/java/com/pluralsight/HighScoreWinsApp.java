package com.pluralsight;

import java.util.Scanner;

public class HighScoreWinsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a game score: ");
        String score = scanner.nextLine().trim();

        String[] mainParts = score.split("\\|");

        if (mainParts.length != 2) {
            System.out.println("Invalid score: Please use format: Home:Visitor|21:9");
            scanner.close();
            return;
        }

        String[] teamParts = mainParts[0].split(":");

        String[] scoreParts = mainParts[1].split(":");

        if (teamParts.length != 2 || scoreParts.length != 2) {
            System.out.println("Invalid score: Please use format: Home:Visitor|21:9");
            scanner.close();
            return;
        }

        String team1 = teamParts[0];
        String team2 = teamParts[1];

        int score1;
        int score2;

        score1 = Integer.parseInt(scoreParts[0]);
        score2 = Integer.parseInt(scoreParts[1]);


        String winner;
        if (score1 > score2) {
            winner = team1;
        } else if (score1 < score2) {
            winner = team2;
        } else {
            winner = "Tie";
        }

        System.out.println("Winner: " + winner);
        scanner.close();

    }
}
