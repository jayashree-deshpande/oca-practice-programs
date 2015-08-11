interface Account{
  public default String getId(){
     return "0000";
  }
}

interface PremiumAccount extends Account{
  public String getId();
}

public class ConcreteClass implements PremiumAccount{
  public static void main(String[] args) {
      Account acct = new Prof();
      System.out.println(acct.getId());
  }

}
