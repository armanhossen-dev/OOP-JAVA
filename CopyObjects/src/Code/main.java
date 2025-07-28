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
		
//		c2 = c1; this works but it makes those two class objects address same so their attributes are now same,
		// we want to make 2 different class address but same attributs value, to copy value or date not making them same address
		
				
		//Before Copy their address are not same, value are also different
		System.out.println("Before Copy: Address are different also Value are different");
		System.out.print(c1 + " "); 
		c1.displayInfo();  
		
		System.out.print(c2 + " ");
		c2.displayInfo();
		
		System.out.println();
				
		c2.copy(c1);
		System.out.println("After Copy: Address are different but Value are same");
		// there memory address is still different but attributes  value same
		System.out.print(c1 + " "); 	c1.displayInfo();  
		System.out.print(c2 + " ");		c2.displayInfo();
				

	}

}
