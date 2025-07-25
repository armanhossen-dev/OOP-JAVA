package Inheritance;

public class Main {
	public static void main(String[] args) {
		
		/// inheritance = the process where one class acquires,
		///               the attributes and methods of another/parent class 
		
		// if any variable is created in the parent class, then i don't have to create that variable in the sub or child class
		// if i create same variable in the child class then it will make some problem ,
		//when i pass value by super() then that value passes to to the parent class not the local 
		//class so when we want to access the variable and value then the local variable will
		//be used by the compiler to show the value , which will not be the passing value we did before, 
		
		Car c1  = new Car("BMW", "White", 250.01);
		c1.moving();
		
		Bicycle b1 = new Bicycle(60.20);
		b1.stop();
		
		System.out.println(c1.speed + " km/h");
		System.out.println(b1.speed + " km/h");
	}
}	
