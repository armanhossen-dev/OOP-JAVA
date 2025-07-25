package objectpassingToMethods;

public class Main {
	public static void main(String[] args) {
		Garage g1 = new Garage();
		Car c1 = new Car("BMW");
		Car c2 = new Car("Volkswagen");
		Car c3 = new Car("Tesla");
		
		//pass objects as argument to a method
		// so when i have make park method then i have to set parameter to accept the object
		g1.park(c1);
		g1.park(c2);
		g1.park(c3);
	}
}	
