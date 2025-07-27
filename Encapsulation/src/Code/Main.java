package Code;

public class Main {
	public static void main(String[] args) {
		/// Encapsulation = attributes of a class will be hidden or private
		///                 can be accessed only through methods (getters & setters)
		///                 you should make attributes private if you don't have a resason to make them 
		Car MyCar = new Car("BMW", "CS", 2028);
		
//		System.out.println(MyCar.make);// this will not work because the make variable is private so it can't be shown, we have to use getter to get the value;
		
		
		
		MyCar.setModel("M20");
		System.out.println(MyCar.getModel()); // M20
		
		
	}
}
