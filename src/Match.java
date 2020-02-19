import java.util.ArrayList;
import java.util.Random;

public class Match {
    Random random = new Random();
    Fighter champ1 = new Fighter("Raid",100,5,6);
    Fighter champ2 = new Fighter("Haidar", 100,6,6);
    Fighter champ3 = new Fighter("Sinan", 100,7,5);
    Fighter champ4 = new Fighter("Srood", 120,8,4);
    Fighter champ5 = new Fighter("Mehdi", 110,5,5);
    Fighter champ6 = new Fighter("Robin", 110,5,4);
    Fighter champ7 = new Fighter("Ali", 110,9,7);
    Fighter champ8 = new Fighter("Krille", 110,9,5);


    public Fighter ran(){
        ArrayList<Fighter> lista = new ArrayList<>();
        lista.add(champ1);
        lista.add(champ2);
        lista.add(champ3);
        lista.add(champ4);
        lista.add(champ5);
        lista.add(champ6);
        lista.add(champ7);
        lista.add(champ8);

        return lista.get(random.nextInt(8));
    }


    private Fighter fighter1;
    private Fighter fighter2;

/*
    public Match() {
        fighter1 = ran();
        while (fighter1.getWin() == 1) {
            fighter1 = ran();
        }
        this.fighter1 = fighter1;

        fighter2 = ran();
        while(fighter2.getWin() == 1 || fighter2.equals(fighter1)){
            fighter2 = ran();
        }
        this.fighter2 = fighter2;
    }
*/

    public void setFighter1() {
        fighter1 = ran();
        while (fighter1.getWin() == 1 || fighter1.getHealth() < 1) {
            fighter1 = ran();
        }

    }

    public void setFighter2() {
        fighter2 = ran();
        while((fighter2.getWin() == 1 || fighter2.equals(this.fighter1)) || fighter2.getHealth() < 1){
            fighter2 = ran();
        }

    }

    public Fighter fighter1() {
        return this.fighter1;
    }


    public Fighter fighter2(){
            return this.fighter2;
        }





    public void setFighter3() {
        fighter1 = ran();
        while ((fighter1.getWin() == 2 || fighter1.getHealth() < 1) || fighter1.getWin() == -1) {
            fighter1 = ran();
        }

    }

    public void setFighter4() {
        fighter2 = ran();
        while((fighter2.getWin() == 2 || fighter2.equals(this.fighter1)) || (fighter2.getHealth() < 1 || fighter2.getWin() == -1)){
            fighter2 = ran();
        }

    }



}
