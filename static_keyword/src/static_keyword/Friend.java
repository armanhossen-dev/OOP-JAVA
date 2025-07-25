package static_keyword;

public class Friend {
	String name;
	int age;
	String homeTown;
	
	static int numberofFriends = 0;
	
	Friend(String name, int age, String homeTown){
		this.name = name;
		this.age = age;
		this.homeTown = homeTown;
		numberofFriends++;
	}
	
	void displayInfo() {
		System.out.println(name + ", " + age + ", " + homeTown);
	}

}
