package Code;

public class main {

	public static void main(String[] args) {
		// playlist : 
		// video: + https://youtu.be/ljGH04_ASG4?list=PLxuuH5GnCIlcGnesYMkGQOqokyI2Fwu3g
		
		// copy some objects
		Car c1 = new Car("Chevrolet", 2020);
		Car c2 = new Car("Ford", 2020);
		
//		System.out.println(c1);
//		System.out.println(c1.getName());
//		System.out.println(c1.getYear());
//		
//		System.out.println();
//		
////	c2 = c1; this works but we will create copy method !!!!
///
///
//		System.out.println(c2);
//		System.out.println(c2.getName());
//		System.out.println(c2.getYear());
//		
//		System.out.println();
		
//		c2 = c1; this works but we will create copy method
		
		
		c2.copy(c1);
		System.out.println(c1); // 2ti memory address alada hobe but value same hobe attributes er
		System.out.println(c2);
		
		System.out.println();
		
		System.out.println(c1); // 2ti memory address alada hobe but value same hobe attributes er
		System.out.println(c2);
		
				

	}

}
