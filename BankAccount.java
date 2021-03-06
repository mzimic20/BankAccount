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

  public boolean withdraw(double amount) {
    if (amount <= 0 || amount > balance) return false;
    else {
      balance -= amount;
      return true;
    }
  }

  public String toString() {
    return "#" + accountID + "\t$" + balance;
  }

  private boolean authenticate(String pass) {
    return password.equals(pass);
  }

  public boolean transferTo(BankAccount other, double amount, String pass) {
    if (authenticate(pass) && withdraw(amount)) {
      if (other.deposit(amount)) return true;
      else return false;
    }
    else return false;
  }

}
