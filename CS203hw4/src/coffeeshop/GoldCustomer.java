package coffeeshop;

public class GoldCustomer extends Customer {
    private Coffee prevOrder, reward;
    private int points;

    public GoldCustomer(String name, String address, String phoneNumber, int numOrders,
                        Coffee prevOrder, Coffee reward, int points) {
        this.setName(name);
        this.setAddress(address);
        this.setNumOrders(numOrders);
        this.setPhoneNumber(phoneNumber);
        this.setLevel("G");
        this.prevOrder = prevOrder;
        this.points = points;
        this.reward = reward;
    }

    public Coffee getPrevOrder() {
        return prevOrder;
    }

    public void setPrevOrder(Coffee prevOrder) {
        this.prevOrder = prevOrder;
    }

    public Coffee getReward() {
        return reward;
    }

    public void setReward(Coffee reward) {
        this.reward = reward;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void findReward() throws Exception {
        if (this.getPoints() >= 10 && this.getPoints() <20){
            this.setReward(new Coffee(this.getName(), "m", false, "", 0, "", "hot"));
        } else if (this.getPoints() > 20){
            this.setReward(new Latte(this.getName(), "m", true, "", 1, "standard", "hot"));
        }
    }
}
