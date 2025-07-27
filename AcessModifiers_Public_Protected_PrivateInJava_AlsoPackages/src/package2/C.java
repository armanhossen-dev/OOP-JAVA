package package2;
import package1.*;

public class C { // while public class then it is visible by other package , 
//class c{ // if only class, no access modifier then this class can be only access by the package where it is

		   String defaultMessage = "Hi Bro! this is the default Message"; // this variable doesn't have any access  modifiers 
	// defaultMessage variable / attribute will be only accessed by the package where this class C is located
	
	public String pubMessage = "Its Public, Any other package can see it!";
	
//	protected String protectedMessage = "This message is protected!"; 
//	//  protected access modifier: this protected variable can be access as long as it's
//	//	the parent class of other sub class, the subclass can access this, otherwise they can't, it can be accessed by other package but they have to be subclass and, this protected variable should be in the parent class
//	

	//	private String privateMessage = "This message is private";
	/// when something is private then it is only visible in that class not by other class or package
	
}
