package Week2.Practise_BoksGame;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Ali" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Burak" , 10 , 95, 100, 0);
        Match match = new Match(marc,alex , 90 , 100);
        match.run();
    }
}

