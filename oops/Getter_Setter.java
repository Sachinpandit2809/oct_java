package oops;

public class Getter_Setter {
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
    p1.username = "sachinPandit";
    p1.setPassword("12345678");
    System.out.println(p1.username);
    System.out.println(p1.getPassword());
    }
}

class BankAccount{
    public String username;
    private String password;

    String getPassword(){ 
      return this.password;
    }  
    void setPassword(String pass){
      this.password = pass;
    }
}
