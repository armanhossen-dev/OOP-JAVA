package Inheritance;

public class Vehicle {
	double speed;	
	Vehicle(double speed){
		this.speed = speed;
	}
	
	void moving() {
		System.out.println("This vehicle is moving!");
	}
		
	void stop() {
		System.out.println("This vehicle has stopped!");
	}
}
