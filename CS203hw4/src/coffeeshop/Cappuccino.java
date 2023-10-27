package coffeeshop;

public class Cappuccino extends Coffee {
    private boolean foam;

    public Cappuccino(String name, String size, boolean cream, String flavor, int espressoShot, String milkType, String temper) throws Exception {
        super(name, size, cream, flavor, espressoShot, milkType, temper);
        double basePrice = 3.5;
        this.setPrice(this.calculatePrice(basePrice));
        this.setType("Cappuccino");
        this.foam = true;
    }

    public boolean isFoam() {
        return foam;
    }

    public void setFoam(boolean foam) {
        this.foam = foam;
    }
}
