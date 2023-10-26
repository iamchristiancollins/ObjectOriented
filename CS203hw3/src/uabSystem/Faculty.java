package uabSystem;

public class Faculty extends UabPerson {
    private String department;
    private int courses;


    public Faculty(String firstName, String lastName, String blazerID, String department, int courses) {
        super(firstName, lastName, blazerID);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "F " + super.toString() + " " + this.getDepartment() + " " + this.getCourses();
    }
}
