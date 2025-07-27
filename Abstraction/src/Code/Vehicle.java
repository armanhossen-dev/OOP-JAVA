package Code;

public abstract class Vehicle {
	//for the abstracts class sub class we can use the abstract class's variable / attributes 
	
	// i can construct Vehicle but not create its object
	// i can create abstract methods 
	abstract void go(); // methods can be only declared, abstract method doesn't have any body
	// when i override this void go() method then i have to make it public , public void go(){---}
	
	abstract void display();	
}
