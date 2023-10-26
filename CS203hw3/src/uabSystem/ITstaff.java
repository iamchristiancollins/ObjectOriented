package uabSystem;

public class ITstaff extends UabPerson {
    private String role;

    public ITstaff(String firstName, String lastName, String blazerID, String role) {
        super(firstName, lastName, blazerID);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "I " + super.toString() + " " + this.getRole();
    }
}
