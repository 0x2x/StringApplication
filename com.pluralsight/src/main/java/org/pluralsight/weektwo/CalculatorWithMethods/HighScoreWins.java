package org.pluralsight.weektwo.CalculatorWithMethods;

import java.util.Scanner;

public class HighScoreWins {
    static void main() {
        // String format = "Home:Visitors|12:15";
        System.out.println("Home:Visitors|12:15");
        System.out.print("Enter teams and points: ");
        Scanner scan = new Scanner(System.in);

        String TeamsAndScores = scan.nextLine();
        String[] TeamSplitScores = TeamsAndScores.split("\\|");
        String Teams = TeamSplitScores[0];
        String Points = TeamSplitScores[1];

        String[] Team = Teams.split(":");
        String HomeTeam = Team[0];
        String AwayTeam = Team[1];

        String[] PointsSplit = Points.split(":");
        String HomeTeamPoint = PointsSplit[0];
        String AwayTeamPoint = PointsSplit[1];

        if(Integer.parseInt(HomeTeamPoint) > Integer.parseInt(AwayTeamPoint)) {
            System.out.println("Home team wins: " + HomeTeam);
            System.out.println("Score: " + HomeTeamPoint);
        } else if (Integer.parseInt(HomeTeamPoint) < Integer.parseInt(AwayTeamPoint)) {
            System.out.println("Away team wins: " + AwayTeam);
            System.out.println("Score: " + AwayTeamPoint);
        } else if (Integer.parseInt(HomeTeamPoint) == Integer.parseInt(AwayTeamPoint)) {
            System.out.println("Its a tie");
        }

    }
}
