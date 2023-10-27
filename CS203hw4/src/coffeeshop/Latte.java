package coffeeshop;

public class Latte extends Coffee {
    private boolean foam;

    public Latte(String name, String size, boolean cream, String flavor, int espressoShot, String milkType, String temper) throws Exception {
        super(name, size, cream, flavor, espressoShot, milkType, temper);
        double basePrice = 3.25;
        this.setType("Latte");
        this.setPrice(this.calculatePrice(basePrice));
        this.setCream(true);
        this.foam = true;
    }

    public boolean isFoam() {
        return foam;
    }

    public void setFoam(boolean foam) {
        this.foam = foam;
    }
}
