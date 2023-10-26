package uabSystem;

public class Staff extends UabPerson{
    private String department, role;

    public Staff(String firstName, String lastName, String blazerID, String department, String role) {
        super(firstName, lastName, blazerID);
        this.department = department;
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "T " + super.toString() + " " + this.getRole() + " " + this.getDepartment();
    }
}
