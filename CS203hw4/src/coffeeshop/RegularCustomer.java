package coffeeshop;

public class RegularCustomer extends Customer {
    public RegularCustomer(String name, String address, String phoneNumber, int numOrders) {
        this.setName(name);
        this.setAddress(address);
        this.setNumOrders(numOrders);
        this.setPhoneNumber(phoneNumber);
        this.setLevel("R");
    }




    @Override
    public String toString() {
        return this.getLevel() + "," + this.getName() + "," + this.getAddress() + "," + this.getPhoneNumber() +
                "," + this.getNumOrders();
    }
}
