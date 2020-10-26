public class Tester {

  public static void main(String[]args) {
    BankAccount a1 = new BankAccount(1, "monke");
    System.out.println( a1.getBalance() );
    System.out.println( a1.getAccountID() );
    System.out.println( a1.deposit(-10.0) );
    System.out.println( a1.getBalance() );
    System.out.println( a1.deposit(150.0) );
    System.out.println( a1.getBalance() );
  }

}
