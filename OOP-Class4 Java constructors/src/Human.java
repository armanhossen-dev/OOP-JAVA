
public class Human {
	int age;
	String name;
	String skin_color;
	String gender;
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
}
