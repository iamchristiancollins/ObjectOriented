package petapp;

public class Dog extends Pet {
	private boolean isAdorable;
	public Dog(String name, int age, boolean isAdorable) {
		super(name, age); //super reuses the constructor of the parent class of this object
		this.isAdorable = isAdorable; //could choose to have the adorable variable in the constructor
	}
	public boolean isAdorable() {
		return isAdorable;
	}
	public void setAdorable(boolean isAdorable) {
		this.isAdorable = isAdorable;
	}
	
	public String makeNoise() {
		return this.getName() + ": BARK!!";
	}
	
	
	public String toString() {
		return super.toString() + " isAdorable: " + isAdorable; //here, super calls a method from its parent class
	}

}
