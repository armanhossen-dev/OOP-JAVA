package Code;

public class Main {
	public static void main(String[] args) {
		
		// abstract = abstract classes cannot be instantiated, but they can have a subclass
		//            abstract methods are declared without an implementation,, 
		/// we can't  create the object of this abstract class but we can inherit or them and use their methods 
		
		Vehicle c1 = new Car();		// this  works
		Car c2 = new Car();
		c1.go(); // this uses the Vehicle method but run as Car's override
		c2.go(); // this directly goes to Car's Override method
		c1.display();  //null 0
		
		//if we inherite any abstract class then the methods mentioned inside the abstract class must be Override inside that sub class 
		
		
		Car c3 = new Car("Bugatti", 2025);
		c3.go();
		c3.display(); //Bugatti 2025			
	}
}
