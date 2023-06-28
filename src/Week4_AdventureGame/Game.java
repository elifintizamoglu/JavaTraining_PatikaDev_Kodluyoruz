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
            System.out.println("6 - Mine -> Award: Can be anything or nothing");
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
                    if (player.getInventory().isFood() != false) {
                        System.out.println("You already have been in Cave and won the Food award.");
                        continue;
                    } else {
                        location = new Cave(player);
                        break;
                    }
                case 4:
                    if (player.getInventory().isFirewood() != false) {
                        System.out.println("You already have been in Forest and won the Firewood award.");
                        continue;
                    } else {
                        location = new Forest(player);
                        break;
                    }
                case 5:
                    if (player.getInventory().isWater() != false) {
                        System.out.println("You already have been in Forest and won the Firewood award.");
                        continue;
                    } else {
                        location = new River(player);
                        break;
                    }
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Please select a valid location!");
            }

            if (location == null) {
                System.out.println("You exited the game, See You Later.");
                break;
            }

            if (!location.onLocation()) {
                System.out.println("Game Over!!!");
                break;
            }
        }

    }
}
