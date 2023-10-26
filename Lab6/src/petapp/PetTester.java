package petapp;

public class PetTester {
	
	public static void main(String[] args) {
		Pet p = new Pet("Some Name", 100);
		System.out.println(p);
		
		Dog d = new Dog("Dixie", 7, true);
		System.out.println(d);
		
		Pet p2 = new Dog("p2", 20, true); //example of polymorphism
		System.out.println(p2);
		
		Wolf w = new Wolf("Wolf", 10, false);
		System.out.println(w);
		
		System.out.println(p.makeNoise());
		System.out.println(p.makeNoise("some other noise"));
		System.out.println(d.makeNoise());
		System.out.println(w.makeNoise());
		
	}

}
