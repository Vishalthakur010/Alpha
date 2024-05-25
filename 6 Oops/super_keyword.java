public class super_keyword {
    public static void main(String[] args){
        horse h= new horse();
        System.out.println(h.color);
    }
}
class animal{
    String color;
    animal(){
        System.out.println("animal class constructor called");
    }
}
class horse extends animal{
    horse(){
        super.color= "brown";
        System.out.println("horse class constructor called");
    }
}
