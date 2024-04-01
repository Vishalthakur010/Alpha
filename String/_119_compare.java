public class _119_compare {
    public static void main(String[] args){
        String s1= "vishal";
        String s2= "vishal";
        String s3= new String("vishal");

        if(s1==s2){
            System.out.println("string is equal");
        }else{
            System.out.println("string is not equal");
        }

        if(s1==s3){
            System.out.println("string is equal");
        }else{
            System.out.println("string is not equal");
        }

        //checking using function
        if(s1.equals(s3)){
            System.out.println("string is equal");
        }else{
            System.out.println("string is not equal");
        }
    }
}
