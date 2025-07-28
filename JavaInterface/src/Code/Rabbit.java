package Code;

public class Rabbit  implements Prey {
	///the interfaces methods are like abstract method ,
	///we have to override them and define them what will they do
	
	//*!!!---------the method while override in the subclass 
	//	           we have to make those method public------!!!
	
	@Override 
	public void flee() {
		System.out.println("The rabbit is running away!");
	}
}
