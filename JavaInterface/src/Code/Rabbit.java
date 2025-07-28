package Code;

public class Rabbit  implements Prey {
	///the interfaces methods are like abstract method ,
	///we have to override them and define them what will they do
	@Override
	public void flee() {
		System.out.println("The rabbit is trying to escape from the hunter.");
	}
}
