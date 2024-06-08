public class throw_throws {
    public static void main(String[] args){
        int arr[]= new int[5];

        try{
            array(arr);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("exception handled");
        }
    }
    public static void array(int arr[]) throws ArrayIndexOutOfBoundsException{
        System.out.println(arr[8]);
    }
}
