package coffeeshop;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Coffee christian = new Coffee("Christian", "l", true, "Vanilla", 2,
                "oat milk", "iced");
        System.out.println(christian.getPrice());


    }
}
