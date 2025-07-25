package Inheritance;

public class Car  extends Vehicle{
	String model;
	String color;
	
	Car(String model, String color, double speed){
		super(speed); //if we want to pass any value or variable by super() then i have to write that super() at the starting of the constructor
		
		this.model = model;
		this.color = color;		
	}
	
	@Override
	void moving() {
		System.out.println("This car started!");
	}
	
	@Override
	void stop() {
		System.out.println("This car has stopped!");
	}
}
