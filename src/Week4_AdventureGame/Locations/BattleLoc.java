package Week4_AdventureGame.Locations;

import Week4_AdventureGame.Beasts.Obstacle;
import Week4_AdventureGame.Characters.Player;
import Week4_AdventureGame.Items.Armor;
import Week4_AdventureGame.Items.Weapon;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    private Random r = new Random();

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("You are currently in " + getName());
        System.out.println("Be careful, " + obsNumber + " " + this.getObstacle().getName() + " is living here.");
        System.out.print("<F>ight or <R>un?: ");
        String selectCase = input.nextLine().toUpperCase();
        if (selectCase.equals("F") && combat(obsNumber)) {
            System.out.println("You defeated all beasts in " + this.getName());
            if (this.name.equals("Cave")) {
                if (this.getPlayer().getInventory().isFood() == false) {
                    System.out.println("---------You won the food.---------");
                    this.getPlayer().getInventory().setFood(true);
                }
            } else if (this.getName().equals("Forest")) {
                if (this.getPlayer().getInventory().isFirewood() == false) {
                    System.out.println("---------You won the firewood.---------");
                    this.getPlayer().getInventory().setFirewood(true);
                }
            } else if (this.getName().equals("River")) {
                if (this.getPlayer().getInventory().isWater() == false) {
                    System.out.println("---------You won the water.---------");
                    this.getPlayer().getInventory().setWater(true);
                }
            } else if(this.getName().equals("Mine")){
                getSnakeAward();
            }


            if ((this.getPlayer().getInventory().isFood()) && this.getPlayer().getInventory().isFirewood() && this.getPlayer().getInventory().isWater()) {
                System.out.println("========================================================");
                System.out.println("YOU VISITED ALL LOCATIONS AND COLLECTED ALL THE AWARDS!");
                System.out.println("YOU WON THE GAME!");
                System.out.println("CONGRATULATION!");
                System.exit(0);
            }
            return true;
        }
        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("You are dead!");
            return false;
        }
        return true;
    }

    public void getSnakeAward(){
        int num = r.nextInt(100);

        if(num < 3){
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(1));
            this.getPlayer().setDamage(this.getPlayer().getDamage() + 2);
            System.out.println("You earned gun. Your new damage is: " + this.getPlayer().getDamage());
        }
        else if(num < 8){
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(2));
            this.getPlayer().setDamage(this.getPlayer().getDamage() + 3);
            System.out.println("You earned sword.Your new damage is: " + this.getPlayer().getDamage());

        }
        else if (num < 15) {
            this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(3));
            this.getPlayer().setDamage(this.getPlayer().getDamage() + 7);
            System.out.println("You earned rifle. Your new damage is: " + this.getPlayer().getDamage());
        }
        else if(num < 18) {
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(1));
            System.out.println("Your earned light armor.");
        }
        else if(num < 23) {
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(2));
            System.out.println("You earned medium armor.");
        }
        else if(num < 30) {
            this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(3));
            System.out.println("You earned serious armor.");
        }
        else if(num < 35){
            this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
            System.out.println("You earned 10 money. Your new balance is " + this.getPlayer().getMoney());
        }
        else if(num < 42){
            this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
            System.out.println("You earned 5 money Your new balance is " + this.getPlayer().getMoney());
        }
        else if(num < 55){
            this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
            System.out.println("You earned 1 money Your new balance is " + this.getPlayer().getMoney());
        }
        else{
            System.out.println("You earned nothing!");
        }
    }

    //Fight method
    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obstacleStats(i);
            int startChance = r.nextInt(100) + 1;
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.print("<H>it or <R>un: ");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("H")) {
                    if (startChance <= 50) {
                        System.out.println("///////You hit the beast.//////");
                        this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println();
                            System.out.println("/////Beast hit you!///////");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                        }
                    } else {
                        System.out.println("+++++Beast hit you!++++++");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                        if(this.getPlayer().getHealth()>0){
                            System.out.println("++++You hit the beast.+++++++");
                            this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                            afterHit();
                        }
                    }

                } else {
                    return false;
                }
            }

            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("You defeated the beasts.");
                System.out.println("You won " + this.getObstacle().getAward() + " money");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAward());
                System.out.println("New money: " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Your Health: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Health: " + this.getObstacle().getHealth());
    }

    public void playerStats() {
        System.out.println("-------------------");
        System.out.println("Player Status");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Money: " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obstacleStats(int i) {
        System.out.println("-------------------");
        System.out.println(i + ". " + this.getObstacle().getName() + " Status");
        System.out.println("Health: " + this.getObstacle().getHealth());
        System.out.println("Damage: " + this.getObstacle().getDamage());
        System.out.println("Award: " + this.getObstacle().getAward());
    }

    public int randomObstacleNumber() {
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
