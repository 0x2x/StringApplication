package org.pluralsight.weektwo.TestStatistics;

import java.util.ArrayList;
import java.util.Arrays;

public class TestStatistics {
    static void main() {
        int[] Scores = {52,32,67,85,57,35,74,12,26,25};
        System.out.println("Average: " + Average(Scores));
        System.out.println("High Score: " + HighScore(Scores));
        System.out.println("Lowest Score: " + LowestScore(Scores));
        System.out.println("Median:" + Median(Scores));
    }

    private static int Average(int[] TotalScores) {
        int Sum = 0;
        for (int i = 0; i < TotalScores.length; i++) {
            Sum += TotalScores[i];
        }
        return Sum / TotalScores.length;
    }


    private static int HighScore(int[] TotalScores) {
        int highestScore = 0;
        for (int i = 0; i < TotalScores.length; i++) {
            if(TotalScores[i] > highestScore) {
                highestScore = TotalScores[i];
            }
        }
        return highestScore;
    }

    private static int LowestScore(int[] TotalScores) {
        int lowestScore = TotalScores[0];
        for (int i = 0; i < TotalScores.length; i++) {
            if(TotalScores[i] < lowestScore) {
                lowestScore = TotalScores[i];
            }
        }
        return lowestScore;
    }

    private static double Median(int[] TotalScores) {
        Arrays.stream(TotalScores).sorted();

        if (TotalScores.length % 2  != 0) {
            return TotalScores[TotalScores.length / 2];
        } else {
            int middleOne = TotalScores[TotalScores.length / 2 -1];
            int middleTwo = TotalScores[TotalScores.length /2];
            return (double) (middleOne + middleTwo) / 2.0;
        }
    }

}
