package petapp;

public class Pet {
	private String name;
	private int age;
	
	public Pet(String name, int age) {
		this.setName(name);
		this.setAge(age);
}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String makeNoise() {
		return this.name + ": some noise";
	}
	
	public String makeNoise(String noise) { //example of overloading (same method, different parameter)
		return this.getName() + ": " + noise;
	}
	
	
	public String toString() {
		return this.name + " is " + this.age + " years old!";
	}
}
