public class Generics_class {
    public static void main(String[] args){
        dog<String, String> d1= new dog<>("jhon", "Leo");
        dog<String, Integer> d2= new dog<>("Don", 52);
        d1.show();

        dog<Integer, String> d3= new dog<>(52, "jhonny");
    }
}
class dog<E, V>{
    E name;
    V id;

    public dog(E name, V id){
        this.name= name;
        this.id=id;
    }
    void show(){
        System.out.println(name);
        System.out.println(id);
    }
}
