package Code;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Hello Dunya");
		/// polymorphism = many shapes / forms
		/// dynamic = after compilation (during runtime)
		/// example : A corvette is a corvette, and a car, and a vehicle, and an object
		
		//for example we will give the user two choices, they can have a dog or a cat
		//we're going to end up either declaring this as an instance of dog class and use the dog constructor

		//		Animal userPet = new Dog();
		//		or Animal userPet = new Cat();

		// or cat class using the cat constructor  , we want the user to make choices then create by constructor
		Scanner sc = new Scanner(System.in);
		Animal usersPet;
		System.out.print("What do you want?\nA. Dog\nB. Cat\n(A/B): ");
		/////char input = sc.nextChar(); // Scanner does'nt have this nextChar method,
		char input = sc.next().charAt(0); 
		
		if(input == 'A' || input == 'a') {
			usersPet = new Dog();
			usersPet.speak();
		}else if(input == 'B' || input == 'b') {
			usersPet = new Cat();
			usersPet.speak();
		}else {
			usersPet = new Animal();
			usersPet.speak();
		}
					
	}
}