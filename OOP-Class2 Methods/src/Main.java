public class Main {
	public static void main(String[] args) {
		// method = a block of code that is executed whenever it is called upon
		hello();
		
		String name = "Arman Hossen Ripon";
		hello(name);
		
		int age = 22;
		hello(name, age);
		
		int x = 33;
		int y = 53;
		int result = sum(x,y);
		println(result);
		
	}		
	static void println(int a) {
		System.out.println(a);
	}
	
	static int sum(int a, int b) {
		return ( a + b );
	}
	
	// to run a method inside Main class i have to make it 'static then return type then method name (){}
	static void hello() {
		System.out.println("Hello World!");
	}
	
	static void hello(String name) {
		System.out.println("Hello " + name);
	}
	
	static void hello(String name, int age) {
		System.out.println("I am "+name +" and "+age + " years old");
	}		
}