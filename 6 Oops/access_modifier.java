public class access_modifier {
    public static void main(String[] args){
        bankaccount myacc=new bankaccount();
        myacc.username="vishal";
        myacc.setpassword("vishal01");
    }
}

class bankaccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password=pwd;
    }
}
