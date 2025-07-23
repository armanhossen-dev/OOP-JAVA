
public class Main {
	public static void main(String[] args) {
		
		//A constructor is a special method that’s automatically called 
		//when an object is created. Its main job? Initialize object properties.
		Human man1 = new Human(40,"male","Siam Hasan", "brown");
		Human woman1 = new Human(35, "female", "Samiha Rahman", "brown");
		
		man1.display();
		woman1.display();	
		
		man1.drink();
		man1.eat();
		
			
	}
}
