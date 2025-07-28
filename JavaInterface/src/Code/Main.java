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
//**!!! the method while override in the subclass we have to make those method public
		///the interfaces methods are like abstract method ,
		/// we have to override them and define them what will they do
		/// also the Override methods will be public returnType methodName(Parameters if they are){...}
		///
		
		

			//we can implement more than one interface by usig "," comma 😎
		    //example: 	public class Fish  implements Prey, Predator{...}
		
		Hawk hawk1 = new Hawk();
		hawk1.hunt();
		
		Rabbit rabbit1 = new Rabbit();
		rabbit1.flee();
		
		System.out.println();
		Fish  fish1 = new Fish();
		fish1.flee();
		fish1.hunt();

	}

}
