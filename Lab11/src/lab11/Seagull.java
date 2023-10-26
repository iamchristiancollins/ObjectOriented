package lab11;

import javax.naming.directory.InvalidSearchFilterException;

public class Seagull extends Bird implements EggLayer{

    public Seagull(){
        this.setSpecies("Seagull");
        this.setCanFly(true);
        this.setCanSwim(true);
    }

    public String makeNoise(){
        return "keow! keow!";
    }

    public String layEgg(){
        return "The " +this.getSpecies() + " has laid an egg!";
    }
}
