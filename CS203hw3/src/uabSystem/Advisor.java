package uabSystem;

public class Advisor extends UabPerson {
    private String department, clients;

    public Advisor(String firstName, String lastName, String blazerID, String department, String clients) {
        super(firstName, lastName, blazerID);
        this.department = department;
        this.clients = clients;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClients() {
        return clients;
    }

    public void setClients(String clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "A " + super.toString() + " " + this.getDepartment() + " " + this.getClients();
    }
}
