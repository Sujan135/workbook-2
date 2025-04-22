package com.pluralsight;

import java.util.Arrays;

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

        Arrays.sort(scores);
        double median;
        int mid = scores.length/2;
        if (scores.length % 2 ==0) {
            median = (scores[mid - 1] + scores[mid]) / 2.0;
        }else {
            median = scores[mid];
        }

        System.out.println("Test Scores Statistics:");
        System.out.printf("Average: %.2f%n", average);
        System.out.println("High Score: " + high);
        System.out.println("Low Score: " + low);
        System.out.printf("Median: %.2f%n", median);
        System.out.printf("Difference between average and median: %.2f%n", Math.abs(average - median));

    }
}
