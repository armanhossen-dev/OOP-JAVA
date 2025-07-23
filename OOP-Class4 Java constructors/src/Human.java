
public class Human {
	int age;
	String name;
	String skin_color;
	String gender;
	
	
	//A constructor is a special method that’s automatically called 
	//when an object is created. Its main job? Initialize object properties.
	
	Human(int a, String gender, String n, String sc){
		age = a;
		name = n;
		this.gender = gender;
		skin_color = sc;
	}
	
	void display() {
		if(gender.equals("male")) {
			System.out.println("Name: " + name + ", He is " + age + " years old " + skin_color +" man.");		
		}
		if(gender.equals("female")){
			System.out.println("Name: " + name + ", she is " + age + " years old " + skin_color +" woman.");
		}
	}
	
	void eat() {
		System.out.println(name + " is eating.");
	}
	
	void drink() {
		System.out.println(name + " is drinking.");
	}
}
