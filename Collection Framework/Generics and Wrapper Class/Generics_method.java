public class Generics_method {
    public static void main(String[] args){
        printdata("vishal");
        printdata(52);

        Generics_method obj= new Generics_method();
        obj.Doubledata("vishalthakur");
    }

    static <E> void printdata(E data){ // Generics methods
        System.out.println(data);
    }

    <E> void Doubledata(E data){
        System.out.println(data);
    }
}
