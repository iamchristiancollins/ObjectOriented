package lab11;

public class Ostrich extends Bird implements EggLayer{

    public Ostrich(){
        this.setSpecies("Ostrich");
        this.setCanFly(false);
        this.setCanSwim(true);
    }

    public String makeNoise(){
        return "*ostrich noise*";
    }

    public String layEgg(){
        return "The " +this.getSpecies() + " has laid an egg!";
    }
}
