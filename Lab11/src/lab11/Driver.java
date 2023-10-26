package lab11;

public class Driver {

    public static void main(String[] args) {
        Ostrich ostrich = new Ostrich();
        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();
        Rockhopper rockhopper = new Rockhopper();
        Seagull seagull = new Seagull();

        System.out.println(ostrich.makeNoise());
        System.out.println(parrot.makeNoise());
        System.out.println(penguin.makeNoise());
        System.out.println(seagull.makeNoise());
        System.out.println(rockhopper.showOffEyebrows());
        System.out.println(penguin.swim());
        System.out.println(ostrich.fly());
        System.out.println(parrot.swim());
        System.out.println(seagull.fly());
        System.out.println(rockhopper.layEgg());

    }
}
