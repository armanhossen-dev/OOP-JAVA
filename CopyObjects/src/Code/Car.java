package Code;

public class Car {
	private String name;
	private int year;
	Car(String name, int year){
		this.name = name;
		this.year = year;
	}
	
	// car copy constructor
	//	Car(Car x){ //if i have copy method then i can copy like this
	//		this.copy(x);
	//	}
	Car(Car target) {
		this.setName(target.getName());
		this.setYear(target.getYear());
	}
	
	//getters
	String getName() {
		return name;
	}
	int getYear(){
		return year;
	}
	
	
	//setters
	void setName(String name) {
		this.name = name;
	}	
	void setYear(int year){
		this.year = year;
	}
	

	public void displayInfo() {
		System.out.println(name + " " + year);
	}
	
	/// if i use toString then we can't see the objects address
//	public String toString(){
//		return name + " " + year;
//	}
//	
	
	
	public void copy(Car target) {
		this.setName(target.getName());
		this.setYear(target.getYear());
	}
		
}
