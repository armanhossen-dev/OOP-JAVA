package Code;

public class Car {
	private String name;
	private int year;
	Car(String name, int year){
		this.name = name;
		this.year = year;
	}
	
	//getters
	String getName() {
		return name;
	}
	int getYear(){
		return year;
	}
	
	
	//setters
	void setName() {
		this.name = name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	void setYear(){
		this.year = year;
	}
	void setYear(int year){
		this.year = year;
	}
	
		
//	public String toString(){
//		return name + " " + year;
//	}
	
	
	public void copy(Car target) {
		this.setName(target.getName());
		this.setYear(target.getYear());
	}
		
}
