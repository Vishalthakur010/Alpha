
public class interfaces1 {
    public static void main(String[] args){
        Bear obj= new Bear();
        obj.herbivoreseat();
        obj.carnivoreseat();
    }
}
interface herbivores{
    void herbivoreseat();
}
interface carnivores{
    void carnivoreseat();
}
class Bear implements herbivores, carnivores{
    public void herbivoreseat(){
        System.out.println("eats grass");
    }
    public void carnivoreseat(){
        System.out.println("eats flesh");
    }
}
