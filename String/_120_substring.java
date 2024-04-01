public class _120_substring {
    public static String substr(String str, int si, int ei ){
        String sub="";
        for(int i=si; i<ei; i++){
            sub += str.charAt(i);
        }
        return sub;
    } 
    public static void main(String[] args){
        String str="vishal thakur";
        System.out.println(str.substring(2,6));//inbuilt function for substring
        int si=4, ei=9;
        System.out.println(substr(str, si, ei));
    }
}
