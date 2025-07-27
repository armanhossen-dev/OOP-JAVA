package package1;
import package2.*;

public class A {
	
	// package is a collection of codes or files
	
	protected String protectedMessage = "This message is protected!"; 
	//  protected access modifier: this protected variable can be access as long as it's
	//	the parent class of other sub class, the subclass can access this, otherwise they can't,
	//	it can be accessed by other package but they have to be subclass and, this protected variable 
	//	should be in the parent class
	
	
	public static void main(String[] args) {  
	
			///Access Levels
			///public - class, package, subclass, world
			///protected - class, package, subclass
			///no modifier - class, package
			///private - class
			
			///lets create a instance of C class, like creating a object, 		
			C c = new C();
			//		System.out.println(c.defaultMessage); // because in C class the defaultMessage has no access modifiers so it will not be visible in other package
			System.out.println(c.pubMessage);
		
//		B b = new B();
//		System.out.println(b.privateMessage); // this will not work, and we can'nt see the private things bruh!
		
		
		
			
	}
}
