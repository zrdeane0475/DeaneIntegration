import java.util.Scanner;

// Zachary Deane
// My project that integrates all the skills that I have learned.

//Commit?

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Dog spot = new Dog();
		spot.size = 30; 
		spot.breed = "German Shepherd";
		System.out.println(spot.breed);
		Dog spuds = new Dog();
		spuds.size = 40;
	}
}

class Dog {
	double size;
	String breed;
}
