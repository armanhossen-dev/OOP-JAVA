package Code;

public class Main {
	public static void main(String[] args) {
		// toString() = special method that all objects inherit, 
		//              that returns  a string that "textually represents" an object.
		//              can be used both implicitly and explicitly
		
		Car c1 = new Car();
		
// to display the c1 objects attributes we can do like this
//		System.out.println(c1.maker);
//		System.out.println(c1.model);
//		System.out.println(c1.color);
//		System.out.println(c1.year);
		//but we can do this by using toString method
		
//		we will display by showing teh c1 or printing the object name , and it will return at first the memory location of that object
		//  System.out.println(c1); //Code.Car@6f539caf, this is the memory location
		
		//if we use objectName.toString(), then it will return the same memory address like
		//  System.out.println(c1.toString()); //Code.Car@6f539caf
		//now we will go to the class of that object and change the toString method by Overriding it to display the values or attributes
		//now both will  show the same info not address 
		System.out.println(c1); // Ford, Mustang,  Red, 2025
		System.out.println(c1.toString());  // Ford, Mustang,  Red, 2025
		
		//here c1.toString() when ever i use this to print the info i use Explicit
		// when i only use c1 , to show the info , i use Implicit
		
	}
}
