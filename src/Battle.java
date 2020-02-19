import java.util.Scanner;

public class Battle {

    Match match = new Match();
    Scanner scanner = new Scanner(System.in);


    public void fight1() {

        for (int i = 0; i < 4; i++) {


            match.setFighter1();
            match.setFighter2();

            System.out.println("The Battle is between " + match.fighter1().getName() + " And " + match.fighter2().getName());
            scanner.nextLine();

            while (match.fighter2().getHealth() > 0 && match.fighter1().getHealth() > 0) {

                int dmg;
                int blc;
                int res;
                System.out.println(match.fighter1().getName() + " Attacks with " + (dmg = match.fighter1().damege()));
                blc = match.fighter2().block();
                res = (dmg - blc);
                if(res > 0) {
                    match.fighter2().loseHealth(res);
                    System.out.println(match.fighter2().getName() + " lost " + res + " Hp, " + match.fighter2().getHealth() + "Hp Left");
                }else{
                    System.out.println(match.fighter2().getName() + " Blocks the Attack!");
                }


                if (match.fighter2().getHealth() < 1 || match.fighter1().getHealth() < 1) {
                    break;
                }

                System.out.println(match.fighter2().getName() + " Attacks with " + (dmg = match.fighter2().damege()));
                blc = match.fighter1().block();
                res = (dmg - blc);
                if(res > 0) {
                    match.fighter1().loseHealth(res);
                    System.out.println(match.fighter1().getName() + " lost " + res + " Hp, " + match.fighter1().getHealth() + "Hp Left");
                } else{
                    System.out.println(match.fighter1().getName() + " Blocks the Attack!");
                }

                System.out.println();


            }
            if (match.fighter2().getHealth() >= 1) {
                System.out.println("Winner is " + match.fighter2().getName() + "!!!!!!");
                match.fighter2().setWin(1);
                System.out.println(match.fighter2().getName() + match.fighter2().getWin());
                match.fighter1().setWin(-1);
                System.out.println(match.fighter1().getName() + match.fighter1().getWin());
            } else {
                System.out.println("Winner is " + match.fighter1().getName() + "!!!!!!");
                match.fighter1().setWin(1);
                System.out.println(match.fighter1().getName() + match.fighter1().getWin());
                match.fighter2().setWin(-1);
                System.out.println(match.fighter2().getName() + match.fighter2().getWin());

            }
        }

    }


    public void fight2(){

        for (int i = 0; i < 2; i++) {


            match.setFighter3();
            match.setFighter4();

            System.out.println("The Battle is between " + match.fighter1().getName() + " And " + match.fighter2().getName());
            scanner.nextLine();

            while (match.fighter2().getHealth() > 0 && match.fighter1().getHealth() > 0) {

                int dmg;
                System.out.println(match.fighter1().getName() + " Attacks with " + (dmg = match.fighter1().damege()));
                match.fighter2().loseHealth(dmg);
                System.out.println(match.fighter2().getName() + " lost " + dmg + " Hp, " + match.fighter2().getHealth() + "Hp Left");


                if (match.fighter2().getHealth() < 1 || match.fighter1().getHealth() < 1) {
                    break;
                }

                System.out.println(match.fighter2().getName() + " Attacks with " + (dmg = match.fighter2().damege()));
                match.fighter1().loseHealth(dmg);
                System.out.println(match.fighter1().getName() + " lost " + dmg + " Hp, " + match.fighter1().getHealth() + "Hp Left");


            }
            if (match.fighter2().getHealth() >= 1) {
                System.out.println("Winner is " + match.fighter2().getName() + "!!!!!!");
                match.fighter2().setWin(2);
                System.out.println(match.fighter2().getName() + match.fighter2().getWin());
                match.fighter1().setWin(-1);
                System.out.println(match.fighter1().getName() + match.fighter1().getWin());
            } else {
                System.out.println("Winner is " + match.fighter1().getName() + "!!!!!!");
                match.fighter1().setWin(2);
                System.out.println(match.fighter1().getName() + match.fighter1().getWin());
                match.fighter2().setWin(-1);
                System.out.println(match.fighter2().getName() + match.fighter2().getWin());
            }
        }
    }

}
