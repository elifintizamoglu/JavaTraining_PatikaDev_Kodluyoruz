package Week4_AdventureGame;

import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to adventure game!");
        System.out.print("Please enter a name: ");
        //String playerName = input.nextLine();
        Player player = new Player("Elif");
        System.out.println("Dear " + player.getName() + " welcome!");
        System.out.println("Please select a character to start the game. ");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println("Locations: ");
            System.out.println("1 - Safe House");
            System.out.println("2 - Tool Store");
            System.out.println("3 - Cave -> Award: Food");
            System.out.println("4 - Forest -> Award: Firewood");
            System.out.println("5 - River -> Award: Water");
            System.out.println("0 - Exit");
            System.out.println("Please select where you want to go: ");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    System.out.println("Please select a valid location!");
            }

            if (location == null) {
                System.out.println("Game Over, See You Later.");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("Game Over!!!");
                break;
            }
        }

    }
}
