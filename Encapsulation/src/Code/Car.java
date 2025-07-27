package Code;

public class Car {
	private String make;
	private String model;
	private int year;
	
	// we can use constructor but not get the value by className.variableName
	Car(String make, String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	// use or not :  "public" before setters and getters 
	// getter - the method with same return type of the variable, this method  returns value of the variable
	// setter - the method with void return type to take parameter same as variables and then assign them
	
	//getters
    String getMake() {
    	return make;
    }
    String getModel() {
    	return model;
    }
    int setYear() {
    	return year;
    }
    
    //setters    - by setter we can set or update the values of attributes or variables
    void setMake(String make) {
    	this.make = make;
    }
    void setModel(String model) {
    	this.model = model;
    }
    void setYear(int year) {
    	this.year = year;
    }
     
    

	
	
	
}
