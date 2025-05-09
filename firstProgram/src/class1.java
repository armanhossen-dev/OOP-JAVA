public class class1 {
    //psvm  -> public static void main(String[] args) { }
    public static void main(String[] args) {
        System.out.println("Hello World");
        int age = 22;
        //sout -> System.out.println();
        //System.out.println(age);
        System.out.print("You are " + age + " years old\n");
    }
}

//public class Car{} this line will be red, because in a java code there should be only one public class
class Home{
    int number_of_rooms = 5;
    int number_of_doors = 6;
    String color = "White";

    ///we use method to do some action
    //methode_return_Type methodName(some Parameters){ some code}
    void displayDetails(){
        System.out.println("The number of rooms " + number_of_rooms);
        System.out.println("The number of Door " + number_of_doors);
        System.out.println("The Color of the house is " + color);
    }

    //after creating mehtod i have to create objecj by class
    //https://youtube.com/playlist?list=PL66eeXZhO4z6tsu_i2BOE1g-MeVxos7PZ&si=w1Q10bkDMCcN7St-

}
