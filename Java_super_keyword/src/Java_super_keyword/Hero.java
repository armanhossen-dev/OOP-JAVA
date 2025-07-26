package Java_super_keyword;

public class Hero extends Person{
	String power;
	String fq;
	Hero(String name, int age, String power, String fq){
		super(name,age);
		this.power = power;
		this.fq = fq;
	}
	
	void display(){
		System.out.println(name + " " + age +  " " + power + " " + fq);
	}
	
	
	public String toString() {
//		return name + " " + age +  " " + power + " " + fq;
		return super.toString() +  " " + power + " " + fq;
	}
}
