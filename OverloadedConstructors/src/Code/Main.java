package Code;

public class Main {
	public static void main(String[] args) {
//		Pizza p1 = new Pizza("Thicc crust", "tomato", "mozzerella", "pepperoni");
//		Here are the ingredients of your pizza:
//			Thicc crust
//			tomato
//			mozzerella
//			pepperoni
		
		
				
//		Pizza p1 = new Pizza("Thicc crust");
//		Here are the ingredients of your pizza:
//			Thicc crust
//			null
//			null
//			null

		
		Pizza p1 = new Pizza("Thicc crust","tomato");
//		Here are the ingredients of your pizza:
//			Thicc crust
//			tomato
//			null
//			null

		
		
		System.out.println("Here are the ingredients of your pizza:");
		System.out.println(p1.bread);
		System.out.println(p1.sauce);
		System.out.println(p1.cheese);
		System.out.println(p1.topping);
				
		
	}
}
