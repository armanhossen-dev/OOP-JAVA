package Code;

public class Main {
	public static void main(String[] args) {
		//Arrays of datatype
		int[] nums = new int[3];
		char[] chars = new char[5];
		String[] strs = new String[3];
		
		
		// Array of food
		Food[] refrigerator = new Food[5];
		
		//lets make some objects
		Food f1 = new Food("Mango");
		Food f2 = new Food("Apple");
		Food f3 = new Food("Banana");
		Food f4 = new Food("Orange");
		Food f5 = new Food("Pineapple");
		
		refrigerator[0] = f1;
		refrigerator[1] = f2;
		refrigerator[2] = f3;
		refrigerator[3] = f4;
		refrigerator[4] = f5;
		int i = 0, j = -1;
		for(Food a : refrigerator ) {
			i++;j++;
			System.out.print(i + ". ");
//			a.display(); // this also works
			System.out.println(refrigerator[j].name);
		}
		
		System.out.println();
		
		Car c1 = new Car("BMW");
		Car c2 = new Car("Porsche");
		Car c3 = new Car("Toyota");
		Car c4 = new Car("Volkswagen");
		
		Car[] cars = {c1, c2, c3, c4};
		for(Car car : cars) {
			System.out.print(car.name + " ");			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}

