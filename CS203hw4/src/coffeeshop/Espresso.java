package coffeeshop;

public class Espresso extends Coffee {


    public Espresso(String name, String size, boolean cream, String flavor, int espressoShot,
                    String milkType, String temper) throws Exception {
        super(name, size, cream, flavor, espressoShot, milkType, temper);
        this.setType("Espresso");
        this.setCream(false);
        double basePrice = 2.5;
        this.setPrice(this.calculatePrice(basePrice));
        this.setTemper("hot");

    }

    @Override
    public String prepare(){
        String prep = "Grinding coffee beans... Filling portafilter... Pulling espresso shot.";
        if (this.isCream()){
            prep += ".. Frothing milk... Pouring.";
        }
        return prep;

    }
}
