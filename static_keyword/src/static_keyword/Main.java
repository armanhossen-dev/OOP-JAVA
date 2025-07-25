package static_keyword;

public class Main {
	public static void main(String args[]) {
		
		// Static = modifier, a sigle copy of a variable/method is created and shared.
		///         the class "owns"  the static member!
		/// for all the 
		
		Friend Rahul = new Friend("Rahul", 23, "Kaliakoir");
		Friend Ratol = new Friend("Ratol", 23, "Gazipur");
		Friend Saief = new Friend("Saief", 23, "Vule gesi");
		Friend Sabbir = new Friend("Sabbir", 23, "ChapaiNawabgonj");
		
		Friend[] vau = {Rahul, Ratol, Saief, Sabbir};
		for(Friend f : vau) {
			f.displayInfo();
		}
//		System.out.println(Sabbir.numberofFriends); this works but we can use 		
//		System.out.println(Friend.numberofFriends); // className.staticVariable to show the static value
		System.out.println( "\nNumber of Friends : " + Friend.numberofFriends);
		
	}
}
