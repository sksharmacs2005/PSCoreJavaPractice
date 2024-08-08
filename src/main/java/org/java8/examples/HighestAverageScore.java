package org.java8.examples;

import java.util.HashMap;
import java.util.Map;

public class HighestAverageScore {
    public static void main(String[] args) {
        String[][] scores = {
                {"Student1", "80"},
                {"Student2", "66"},
                {"Student2", "10"},
                {"Student3", "45"},
                {"Student4", "130"},
                {"Student4", "110"}
        };

        // Step 1: Parse the input and calculate total scores and counts
        Map<String, int[]> scoreMap = new HashMap<>();
        for (String[] score : scores) {
            String student = score[0];
            int scoreValue = Integer.parseInt(score[1]);

            scoreMap.putIfAbsent(student, new int[2]);
            scoreMap.get(student)[0] += scoreValue; // Sum of scores
            scoreMap.get(student)[1] += 1; // Count of scores
        }

        // Step 2: Calculate averages and find the highest average
        String bestStudent = null;
        int highestAverage = Integer.MIN_VALUE;

        for (Map.Entry<String, int[]> entry : scoreMap.entrySet()) {
            String student = entry.getKey();
            int totalScore = entry.getValue()[0];
            int count = entry.getValue()[1];
            int average = totalScore / count; // Integer division for flooring

            if (average > highestAverage) {
                highestAverage = average;
                bestStudent = student;
            }
        }

        // Step 3: Print the result
        if (bestStudent != null) {
            System.out.println("Student with the highest average score: " + bestStudent);
            System.out.println("Highest average score: " + highestAverage);
        } else {
            System.out.println("No scores available.");
        }
    }
}
