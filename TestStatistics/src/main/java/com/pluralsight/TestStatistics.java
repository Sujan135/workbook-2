package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        int [] scores = {85, 92, 76, 88, 95, 79, 82, 94, 73, 86};

        double sum = 0;
        for (int score : scores) {
            sum += score;
        }

        double average = sum / scores.length;

        int high = scores[0];
        int low = scores[0];
        for (int score: scores) {
            if (score > high) high = score;
            if (score < low) low = score;
        }

        System.out.println("Test Scores Statistics:");
        System.out.printf("Average: %.2f%n", average);
        System.out.println("High Score: " + high);
        System.out.println("Low Score: " + low);

    }
}
