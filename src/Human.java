public class Human {
    //constructor = special method that is called when an object is created
    //constructor has the same name as the class
    //constructor is used to initialize the object

    String name;
    int age;

    Human(String name, int age){
        //this.name/age refers to the name of the object
        this.name = name;
        this.age = age;
    }

    //method
    void eat(){
        System.out.println(this.name + " is eating");
    }

    void walk(){
        System.out.println(this.name + " is walking");
    }
}
