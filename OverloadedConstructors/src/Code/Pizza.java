package Code;

public class Pizza {
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	//overloaded constructors , same name but different parameters
//	1
	Pizza(String bread,String sauce,String cheese,String topping){
		this.bread = bread;
		this.sauce = sauce; 
		this.cheese = cheese;
		this.topping = topping; 
	}
//	2
	Pizza(String bread){
		this.bread = bread;
	}
//	3
	Pizza(String bread,String sauce){
		this.bread = bread;
		this.sauce = sauce; 
	}
//	4
	Pizza(String bread,String sauce,String cheese){
		this.bread = bread;
		this.sauce = sauce; 
		this.cheese = cheese; 
	}
}
