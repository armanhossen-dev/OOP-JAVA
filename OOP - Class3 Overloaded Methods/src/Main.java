
public class Main {
	public static void main(String[] args) {
		//System.out.println("Hello");
		// Overloaded methods = method that share the same name but have different parameters
		// method name + parameters = method signature!
		
		int a1 = add(1,2);
		int a2 = add(1,2,3);
		double a3 = add(1.0, 2.3);
		double a4 = add(2.41, 4.40, 6.40);
		double a5 = add(2, 4.9);
		double a6 = add(5.30, 23);
		
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);
		System.out.println("a4 = " + a4);
		System.out.println("a5 = " + a5);
		
	}
	/// overloaded methods same name but different parameters
	static int add(int a, int b) {
		return a + b;
	}
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	static double add(double a, double b) {
		return a + b;
	}
	static double add(double a, double b, double c) {
		return a + b + c;
	}
	static double add(int a, double b) {
		return a + b;
	}
	static double add(double b, int a) {
		return a + b;
	}
	
}
