public class polymorphism{
    public static void main(String[] args){
        // calculator add= new calculator();
        // System.out.println(add.sum(3,5));
        // System.out.println(add.sum((float)6.3,(float)2.4));
        // System.out.println(add.sum(12,23,15));

        Deer wild= new Deer();
        wild.eat();
    }
}

// Method overriding
    class Animal{
        void eat(){
            System.out.println("eat anyhing");
        }
    }
    class Deer extends Animal{
        void eat() {
            System.out.println("eat only grass");
        }
    }

// Method overloading
    // class calculator{
    //     int sum(int a, int b){
    //         return a+b;
    //     }
    //     float sum(float a, float b){
    //         return a+b;
    //     }
    //     int sum(int a, int b, int c){
    //         return a+b+c;
    //     }
    // }