package Codes;

public class Main {
	public static void main(String[] args) {
		/// polymorphism = greek word for -> 
		/// 							  poly-means: many
		///                               morph-means: form
		///the ability of an object to identify as more than one type
		
		Car c1 = new Car();
		Bicycle bi1 = new Bicycle();
		Boat bo1 = new Boat();
		
		// to make c1, bi1, bo1 into an array we need to make the array type as their parent class type
		// because Car type can only store car object, so on
		Vehicle[] racers = {c1, bi1, bo1};
		
//		c1.go();
//		bi1.go();
//		bo1.go();
		
		for(Vehicle v : racers) {
			v.go();
		}
		
//		The Car begins moving
//		The bicycle begins moving
//		The boat begins moving
		
	}
}