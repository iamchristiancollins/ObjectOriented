package lab11;

public class Parrot extends Bird implements EggLayer{

    public Parrot(){
        this.setCanFly(true);
        this.setCanSwim(false);
        this.setSpecies("Parrot");
    }

    public String makeNoise(){
        return "Hello! Parrots can talk!";
    }
    public String layEgg(){
        return "The " +this.getSpecies() + " has laid an egg!";
    }
}
