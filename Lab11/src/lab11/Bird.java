package lab11;

public abstract class Bird {
    private String species;
    private boolean canFly, canSwim;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public String fly(){
        if (this.isCanFly()){
            return "The " + this.getSpecies() + " soars across the sky!";
        } else {
            return "The " + this.getSpecies() + " hops in the hope of flight, but finds no success.";
        }
    }
    public String swim(){
        if (this.isCanSwim()){
            return "The " + this.getSpecies() + " propels itself through the water with ease!";
        }else {
            return "The "+ this.getSpecies() + " struggles for a moment before barely making it back to shore.";
        }
    }

    public abstract String makeNoise();
}
