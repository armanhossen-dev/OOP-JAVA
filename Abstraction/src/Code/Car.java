package Code;

public class Car extends Vehicle {
	
	String name;
	int year;
	
	Car(){}
	Car(String name, int year){
		this.name = name;
		this.year = year;
	}	
			
	@Override
	public void display() {
		System.out.println(name + " " +year);
	}
	
	@Override 
	public void go() {
		System.out.println("The driver is driving the Car!");
	}

}
