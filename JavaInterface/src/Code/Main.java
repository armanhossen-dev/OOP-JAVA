package Code;

public class Main {

	public static void main(String[] args) {
		/// interface = a template that can be applied to a class
		/// similar to inheritance, but specifies what a class has/must do.
		/// classes can apply more than one interface, inheritance is limited to 1 super class
		///
		///we have to implement those interface, buy using keyword = implements
		///
		///in interface we can create variables and method 
		///but we can't create body {} for them, just declaration for methods
		///the interfaces methods are like abstract method , we have to override them and define them what will they do

		Rabbit rabbit1 = new Rabbit();
		rabbit1.flee();

	}

}
