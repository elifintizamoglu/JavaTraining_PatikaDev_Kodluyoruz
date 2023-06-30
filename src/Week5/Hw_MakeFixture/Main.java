package Week5.Hw_MakeFixture;

public class Main {
    public static void main(String[] args) {
        Fixture fix = new Fixture();
        fix.teams.add("Fenerbahçe");
        fix.teams.add("Galatasaray");
        fix.teams.add("Beşiktaş");
        fix.teams.add("Trabzonspor");
        fix.teams.add("Hatayspor");
        fix.teams.add("Bursaspor");

        fix.printLeagueFixture();
    }
}
