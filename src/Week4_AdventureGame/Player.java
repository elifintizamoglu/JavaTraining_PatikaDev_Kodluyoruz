package Week4_AdventureGame;

import java.util.Scanner;

public class Player {
    private String name;
    private String charName;
    private int damage;
    private int health;
    private int money;
    private Inventory inventory;
    private int originalHealth;

    private Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Knight(), new Archer()};
        System.out.println("---------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("Character id: " + gameChar.getId() +
                    "\nCharacter name: " + gameChar.getName() +
                    "\nDamage: " + gameChar.getDamage() +
                    "\nHealth: " + gameChar.getHealth() +
                    "\nMoney: " + gameChar.getMoney());
            System.out.println("---------------------------");
        }

        System.out.print("Enter a character id number: ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
            case 3:
                initPlayer(new Archer());
                break;
            default:
                initPlayer(new Samurai());
        }

        System.out.println("Selected character: ");
        System.out.println("Name: " + this.getCharName());
        System.out.println("---------------------------");
    }

    public void printInfo() {
        System.out.println("Your weapon: " + this.getInventory().getWeapon().getName() +
                "\nYour armor: " + this.getInventory().getArmor().getName() +
                "\nYour block: " + this.getInventory().getArmor().getBlock() +
                "\nDamage: " + this.getTotalDamage() +
                "\nHealth: " + this.getHealth() +
                "\nMoney: " + this.getMoney());
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
        this.setOriginalHealth(gameChar.getHealth());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
