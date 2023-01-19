import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //call the constructor
        //create a Human
        //instance of the Human class
        Human human = new Human("Bob", 25);
        //call attributes
        System.out.println(human.name);
        System.out.println(human.age);
        //call the method
        human.eat();
        System.out.println("------------------------");
        //create a second Human
        //with different values
        Human human2 = new Human("Sue", 35);
        //call attributes
        System.out.println(human2.name);
        System.out.println(human2.age);
        //call the method
        human2.eat();
        human2.walk();

        System.out.println("------------------------");

        //first Option
        // Create an ArrayList of Strings
        //String[] animals = {"Dog", "Cat", "Bird", "Fish"};

        //second Option
        //iterate through the elements of an array
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Fish");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}

