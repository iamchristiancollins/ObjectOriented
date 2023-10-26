package uabSystem;

public class Student extends UabPerson {
    private String level, major;
    private float gpa;

    public Student(String firstName, String lastName, String blazerID, String level, String major, float gpa){
        super(firstName, lastName, blazerID);
        this.level = level;
        this.major = major;
        this.gpa = gpa;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "S " + super.toString() + " " + this.getLevel() + " " + this.getMajor() + " " + this.getGpa();
    }
}
