package Java_super_keyword;

public class Person {
	String name;
	int age;
	
	Person(String name,int age){
		this.name  = name;
		this.age = age;
	}
	public String toString() {
		return name + " " + age;
	}
}
