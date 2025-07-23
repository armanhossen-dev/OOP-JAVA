
public class Cat {
	String name;
	String color;
	int age;
	Cat(String name, String color, int age){
		this.name =  name;
		this.color = color;
		this.age = age;
	}
	
	void display() {
		System.out.println(name + ", " + color +", "+ age);
	}
	
}
