public class Tester {

  public static void main(String[]args) {
    BankAccount a1 = new BankAccount(1738, "monke");
    System.out.print("getBalance: ");
    System.out.println( a1.getBalance() );
    System.out.print("getAccountID: ");
    System.out.println( a1.getAccountID() );
    System.out.print("deposit, invalid: ");
    System.out.print( a1.deposit(-10.0) );
    System.out.println( a1.getBalance() );
    System.out.print("deposit, valid: ");
    System.out.print( a1.deposit(679.0) );
    System.out.println( a1.getBalance() );
    System.out.print("withdraw, invalid");
    System.out.print( a1.withdraw(-10.0) );
    System.out.println( a1.getBalance() );
    System.out.print("withdraw, valid");
    System.out.print( a1.withdraw(360.0) );
    System.out.println( a1.getBalance() );
    System.out.print("toString: ");
    System.out.println( a1.toString() );
  }

}
