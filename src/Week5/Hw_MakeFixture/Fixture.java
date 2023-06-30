package Week5.Hw_MakeFixture;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Fixture {
    public static Random rnd = new Random();

    ArrayList<String> teams = new ArrayList<>(); // all teams
    Set<String> firstRound = new LinkedHashSet<>(); // first match
    Set<String> secondRound = new LinkedHashSet<>(); // second match
    ArrayList<String> teamsMatchedBefore = new ArrayList<>(); //teams matched before

    public void printLeagueFixture() {

        // if team size is odd, add "Bay"
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        // print teams
        System.out.println("Teams: ");
        for (String team : teams) {
            System.out.print(team + " - ");
        }
        System.out.println("\n");
        matchRound();
    }

    public void matchRound() {
        ArrayList<String> home = new ArrayList<>();
        ArrayList<String> away = new ArrayList<>();

        for(int i = 0; i < teams.size()-1; i++) {
            home.clear();
            away.clear();

            while(home.size() < teams.size()/2) {

                String homeTeam = teams.get(rnd.nextInt(teams.size()));
                String awayTeam = teams.get(rnd.nextInt(teams.size()));

                if((! homeTeam.equals(awayTeam))) {

                    if(teamsMatchedBefore.contains(homeTeam+awayTeam)== false && teamsMatchedBefore.contains(awayTeam+homeTeam)== false) {

                        if(home.contains(homeTeam)== false && away.contains(awayTeam)== false) {

                            home.add(homeTeam);
                            away.add(awayTeam);
                            teamsMatchedBefore.add(awayTeam+homeTeam);
                            teamsMatchedBefore.add(homeTeam+awayTeam);

                            firstRound.add(homeTeam+" vs "+awayTeam);

                            secondRound.add(awayTeam+" vs "+homeTeam);
                        }
                    }
                }
            }
        }

        int brace = 0 ;
        int week = 1;

        System.out.println("----- First Matches ------");

        System.out.println(week+". Week Matches: ");
        for(String s : firstRound) {
            System.out.println(s);
            brace++;
            if(brace == teams.size()/2) {
                System.out.println();
                brace=0;
                week++;
                System.out.println(week+". Week Matches: ");
            }
        }
        System.out.println("----- Return Matches -----");
        for(String s : secondRound) {
            System.out.println(s);
            brace++;
            if(brace == teams.size()/2) {
                System.out.println();
                brace=0;
                week++;
                if(week <= (teams.size()-1)*2) {
                    System.out.println(week+". Week Matches: ");
                }
            }
        }

    }
}
