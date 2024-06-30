import comparable.Animal;
import java.util.*;

class MyCustomComparator implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2){
        // return o1.weight - o2.weight;
        return Integer.compare(o1.getweight(), o2.getweight());
    }
}

public class implement {
    public static void main(String[] args){
        Animal a1= new Animal(5, "Leo", 10);
        Animal a2= new Animal(8, "tiger", 12);
        Animal a3= new Animal(3, "Dog", 8);
        Animal a4= new Animal(3, "Leopard", 5);

        List<Animal> Dogs= new ArrayList<>();

        Dogs.add(a1);
        Dogs.add(a2);
        Dogs.add(a3);
        Dogs.add(a4);

        System.out.println(Dogs);
        
        // Collections.sort(Dogs);  1st method

        // Collections.sort(Dogs, new MyCustomComparator());   // 2nd method

    //     Collections.sort(Dogs, new Comparator<Animal>() {  // 3rd method
    //         @Override
    //         public int compare(Animal o1, Animal o2){
    //             return o1.name.compareTo(o2.name);
    //         }
    // });

    // java 8 feature
            // Collections.sort(Dogs,(o1,o2) -> o1.name.compareTo(o2.name));

            // Collections.sort(Dogs, Comparator.comparing(Animal::getage));

            // if the age is same the the comparing will be done on the basis of name
            Collections.sort(Dogs, Comparator.comparing(Animal::getage).thenComparing(Animal::getname));

        System.out.println(Dogs);

        // int a[][]={
        //         {5,7,3},
        //         {8,3,9},
        //         {2,6,4},
        // };

        // Arrays.sort(a,(arr1, arr2) -> 
        // {
        //     return arr1[0] -arr2[0];
        // });

        // for(int e[]: a){
        //     for(int element : e){
        //         System.out.print(element + " ");
        //     }
        //     System.out.println();
        // }
    }
}
