public class _152_Inheritance {
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();
        shark.swim();
    }
}
//base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}

//derived class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swim");
//     }
// }

//Heirarchy
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void Fly(){
        System.out.println("Fly");
    }
}
class Mammal extends Animal{
    void mammal(){
        System.out.println("walk");
    }
}