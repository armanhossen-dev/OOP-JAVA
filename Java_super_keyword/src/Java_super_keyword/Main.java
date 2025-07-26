package Java_super_keyword;

public class Main {
	public static void main(String[] args) {
		// 'super' is a keyword that refers to the superclass (parent) of an object.
		// It is similar to the 'this' keyword, but it specifically targets the parent class.

		// To access a parent class's variable or method, use: super.parentVariableName or super.parentMethodName()

		// super() is used to call the constructor of the parent class.
		// This is useful when the parent class has parameters that need to be passed during object creation.

		// When creating a child class object, we use super() to pass the required arguments to the parent class constructor,
		// ensuring proper initialization of inherited fields.
		
		
		Hero IronMan =   new Hero("Anthony Edward Stark ", 48, "[Genius-Arc-Reactor-IronSuit]", "-- I am Iron Man");
		Hero SpiderMan = new Hero("Peter Benjamin Parker", 25, "[Responsibility]", "             -- With great power comes great responsibility");
		Hero BatMan =    new Hero("Bruce Thomas Wayne   ", 40, "[Rich]","                       -- I am vengeance. I am the night. I am Batman");
		
//		IronMan.display();
		System.out.println(IronMan);
		SpiderMan.display();
//		BatMan.display();
		
//		System.out.println(IronMan.name); it works
		
		
		
		
		
		
		
		
		
 
	}
}
