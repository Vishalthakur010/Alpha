public class _145_get_set {
        public static void main(String[] args){
            pen p1= new pen(); //created object p1 of the pen class
            p1.setcolor("blue");
            System.out.println(p1.getcolor());

            p1.setTip(5);
            System.out.println(p1.getTip());

            p1.setcolor("red");
            System.out.println(p1.getcolor()) ;
        }
    }
    //property + Function
    class pen{
        // property
        private String color;
        private int tip;
    
        // Getters
        String getcolor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }

        //setters
        void setcolor(String color){
            this.color=color;
        }
        void setTip(int tip){
            this.tip=tip;
        }
    }
