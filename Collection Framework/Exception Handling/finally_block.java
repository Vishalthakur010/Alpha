public class finally_block{
    public static void main(String[] args){
        int arr[] = new int[5];

        System.out.println("hello vishal");

        try{
            System.out.println(arr[6]);
        }
        // catch(Exception e){
        //     System.out.println("Exception Handeled");
        // }
        finally{
            System.out.println("finally block runs always");
        }

        System.out.println("bye vishal");
    }
}