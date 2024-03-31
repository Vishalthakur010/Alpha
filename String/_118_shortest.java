public class _118_shortest {
    public static float shortest_path(String Direction){
        int x=0, y=0;
        for(int i=0; i<Direction.length(); i++){
            char direct= Direction.charAt(i);
            //south
            if(direct== 's'){
                y--;
            }
            //north
            else if(direct== 'N'){
                y++;
            }
            //east
            else if(direct == 'E'){
                x++;
            }
            //west
            else if(direct == 'W'){
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2 + y2);
    }
    public static void main(String[] args){
        String Direction="WNEENESENNN";
        System.out.println(shortest_path(Direction));
    }
}
