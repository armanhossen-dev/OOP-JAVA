package oop1;

public class Car {
	String name;
	double speedhr;
	Car(String name, double speedhr){
		this.name = name;
		this.speedhr = speedhr;
	}
	void display() {
		System.out.println("Car Name: " +  name + ", Speed: " + speedhr + "km/hr");
	}
}
