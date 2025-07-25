package Inheritance;

public class Bicycle  extends Vehicle{
	
	//	double speed;     ///don't create the same variable in the child class 

	// if any variable is created in the parent class, then i don't have to create that variable in the sub or child class
	// if i create same variable in the child class then it will make some problem ,
	//when i pass value by super() then that value passes to to the parent class not the local 
	//class so when we want to access the variable and value then the local variable will
	//be used by the compiler to show the value , which will not be the passing value we did before,
	Bicycle(double speed){
		super(speed);
	}
	
	
	@Override
	void moving() {
		System.out.println("This cycle is start moving!");
	}
	
	@Override
	void stop() {
		System.out.println("This bike has stopped!");
	}
}
