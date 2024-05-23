public class _01_Abstract {
    public static void main(String[] args){
        // Dog obj= new Dog();
        // obj.eat();
        // obj.walk();
        // System.out.println(obj.color);

        // chicken obj1= new chicken();
        // obj1.eat();
        // obj1.walk();

        Labra obj = new Labra();
        // Animal -> Dog -> Labra
    }
}
abstract class animal{
    String color;

    animal(){
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Dog extends animal{
    Dog(){
        System.out.println("Dog constructor called");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Labra extends Dog{
    Labra(){
        System.out.println("Labra constructor called");
    }
}
class chicken extends animal{
    void changecolor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
