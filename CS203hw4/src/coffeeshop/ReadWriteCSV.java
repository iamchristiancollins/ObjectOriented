package coffeeshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadWriteCSV {

    private static final String FILENAME = "CoffeeCustomers.csv";
    private static final String DELIMITER = ",";
    private static int counter;


    public static ArrayList<Customer> csvReader() throws IOException {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader(Paths.get(FILENAME).toFile()));
        br.readLine();
        while ((line = br.readLine()) != null){
            String[] data = line.split(DELIMITER);
            if (data[0].compareToIgnoreCase("R") == 0){
                customers.add(new RegularCustomer(data[1], data[2], data[3], Integer.parseInt(data[4])));
                } /*else if (data[0].compareToIgnoreCase("G") == 0) {
                customers.add(new GoldCustomer(data[1], data[2], data[3], Integer.parseInt(data[4])),
                        createCoffee(data[1], data[5]), createReward(data[6]), Integer.parseInt(data[7]));
            }*/

            }
        br.close();

        return customers;


        }

        //make a createCoffee method to create a coffee order from csv date
    //in the csv, the coffee column will be Type-Description-Price-Cream-EspressoShot-milkType
    public static Coffee createCoffee(String name, String coffee) throws Exception {
        String delimit = "-";
        String[] traits = coffee.split(delimit);
        if (traits[0].compareToIgnoreCase("Coffee") == 0){
            Coffee prev = new Coffee(name, traits[1], Boolean.parseBoolean(traits[2]), traits[3],
                    Integer.parseInt(traits[4]), traits[5], traits[6]);
            prev.setEspressoShot(Integer.parseInt(traits[4]));
            prev.setCream(Boolean.parseBoolean(traits[3]));
            prev.setMilkType(traits[5]);
            return prev;
        } else if ((traits[0].compareToIgnoreCase("Espresso")) == 0){
            Coffee prev = new Espresso(name, traits[1], Boolean.parseBoolean(traits[2]), traits[3],
                    Integer.parseInt(traits[4]), traits[5], traits[6]);
            //NEED TO FINISH
            return prev;
        }
        return null;


    }


}
