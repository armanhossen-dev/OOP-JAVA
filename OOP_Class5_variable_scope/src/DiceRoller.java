import java.util.Random;

public class DiceRoller {
	
	Random ran;
	int num;
	DiceRoller(){
//		Random ran = new Random();  //local variable
//		int num = 0;			    //local variable		
		ran = new Random();
//		roll(ran, num);		        //local variable
	}
	
//	void roll(Random ran,int num) { // when the local variable is not commented
	void roll() {
		// we want 1 to 6 so we write 6 in the (braket) now it will generate random 0 to 5, then +1 so that if it's zero then it make 1, 
		num = ran.nextInt(6)+1;
		System.out.println(num);
	}
	
	
}
