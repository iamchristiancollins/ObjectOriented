package lab3;

import java.util.Objects;

public class UABPerson {
	
	private String name;
	private String gender;
	private int age;
	private String blazerID;
	
	public UABPerson(String name, String gender, int age, String blazerID) {
		this.setName(name);
		this.setGender(gender);
		this.setAge(age);
		this.setBlazerID(blazerID);
	}
	
	public UABPerson() {
		this.name = "Blazer";
		this.gender = "N/A";
		this.age = 0;
		this.blazerID = "BlazerID";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getBlazerID() {
		return blazerID;
	}



	public void setBlazerID(String blazerID) {
		this.blazerID = blazerID;
	}
	
	public boolean checkPalindrome() {
		String name = this.getName();
		name = name.toLowerCase();
		String reversed = "";
        char ch;

        for (int i=0; i<name.length(); i++){
            ch = name.charAt(i);
            reversed = ch + reversed;
        }
        if (name.equals(reversed)){
            return true;
        }
        return false;
	}
	
	public int yearsUntilRetirement() {
		int age = this.getAge();
		return 65 - age;
	}
	
	public String toString() {
		return this.getName() + " is " + this.getAge() + " years old.";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UABPerson other = (UABPerson) obj;
		return age == other.age && Objects.equals(blazerID, other.blazerID) && Objects.equals(gender, other.gender)
				&& Objects.equals(name, other.name);
	}
	
	
	
	

}
