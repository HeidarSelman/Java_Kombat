import java.util.Random;

public class Fighter {
    private Random random = new Random();
    private String name;
    private int health;
    private int attack;
    private int defence;
    private int win;

    public Fighter(String name, int health, int attack, int defence) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.win = 0;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health < 1){
            System.out.println(this.name + " knocked out--------------------------");
        }
    }


    public int damege(){
    int dmg = random.nextInt(this.attack)+1;
        return dmg;
    }

    public int block(){
    int blc = random.nextInt(this.defence)+1;
        return blc;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getWin() {
        return win;
    }
}
