public class interfaces {
    public static void main(String[] args){
        king obj= new king();
        obj.moves();
    }
}

interface chessplayer{
    void moves();
}
class Queen implements chessplayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }
}
class Roook implements chessplayer{
    public void moves(){
        System.out.println("up, down, left, Right");
    }
}
class king implements chessplayer{
    public void moves(){
        System.out.println("up, down, left, Right, diagonal - by 1 step");
    }
}

