package petapp;

public class Wolf extends Dog {
	public Wolf(String name, int age, boolean isAdorable) {
		super(name, age, isAdorable);
	}
	
	public String makeNoise() {
		return this.getName() + ": AWOOOOOOOO!";
	}

}
