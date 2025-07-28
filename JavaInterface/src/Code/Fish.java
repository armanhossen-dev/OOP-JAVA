package Code;

public class Fish  implements Prey, Predator{
	//yes , we can implement more than one interface by usig "," comma 😎
	@Override
	public void flee() {
		System.out.println("The fish is running away!");
	}
	
	@Override
	public void hunt() {
		System.out.println("The fish is hunting!");
	}
	
}
