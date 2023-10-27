package coffeeshop;


public class Coffee {
    private String name, size, milkType, type, flavor="", temper;
    private double price;
    private int espressoShot;
    private boolean cream;

    public Coffee(String name, String size, boolean cream, String flavor, int espressoShot,
                  String milkType, String temper) throws Exception{
        if (espressoShot < 0){
            throw new Exception("Cannot have negatice espresso shots!");
        }
                this.name = name;
                this.size = size;
                double basePrice = 1.5;
                this.flavor = flavor;
                this.price = calculatePrice(basePrice);
                this.cream = cream;
                this.espressoShot = espressoShot;
                this.milkType = milkType;
                this.type = "Coffee";
                this.temper = temper;
            }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCream() {
        return cream;
    }

    public void setCream(boolean cream) {
        this.cream = cream;
    }

    public int getEspressoShot() {
        return espressoShot;
    }

    public void setEspressoShot(int extraShot) {
        this.espressoShot = extraShot;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getTemper() {
        return temper;
    }

    public void setTemper(String temper) {
        this.temper = temper;
    }

    public double calculatePrice(double basePrice){
        if (this.getSize().equalsIgnoreCase("medium") || this.getSize().equalsIgnoreCase("m")){
            basePrice *= 1.4;
        } else if (this.getSize().equalsIgnoreCase("large") || this.getSize().equalsIgnoreCase("l")){
            basePrice *= 1.8;
        }
        double price = basePrice + 0.75 * this.getEspressoShot();
        if (!this.getFlavor().equals("")) {
            price += 0.5;
        }
        return price;
    }

    public String prepare(){
        String creamState = "";
        String shotState = "";
        String prep = "Preparing " + this.getTemper() + " " + this.getFlavor() + " " + this.getType();
        if (this.getEspressoShot()>0){
            shotState += " with " + this.getEspressoShot() + " espresso shots";
            prep += shotState;
        }
        if (this.isCream()){
            creamState += " with " + this.getMilkType()+ " cream";
            prep += creamState;
        }
        return prep + " for " + this.getName();
    }
}
