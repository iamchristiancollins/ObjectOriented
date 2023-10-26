package uabSystem;

public class UabPerson {
    private String blazerID, firstName, lastName;

    public UabPerson(String firstName, String lastName, String blazerID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.blazerID = blazerID;
    }

    public String getBlazerID() {
        return blazerID;
    }

    public void setBlazerID(String blazerID) {
        this.blazerID = blazerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getBlazerID();
    }
}
