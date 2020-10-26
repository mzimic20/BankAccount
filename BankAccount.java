public class BankAccount {

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int acc, String pass) {
    balance = 0.0;
    accountID = acc;
    password = pass;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String newPass) {
    password = newPass;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    }
    else return false;
  }

}
