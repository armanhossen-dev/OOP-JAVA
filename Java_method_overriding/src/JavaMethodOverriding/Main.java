package JavaMethodOverriding;

public class Main {
	public static void main(String[] args) {
		/// method overriding = Declaring a method in sub class,
		///                     which is already present in parent class
		///                     Done so that a child class can give its own implementation
		/// before the line of the method, we have to use @Override keyword 
		/// it allows the parent method to be changed for that sub class as needed and every time that class wants this method it will run the Override , not the parent method
		/// here, return type, and method name , parameter is same only the inside body programes are changed
		
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		
		d1.speak();
		c1.speak();
		
		//Bark Bark
		//Meow Meow!
		
		 
	}
}
