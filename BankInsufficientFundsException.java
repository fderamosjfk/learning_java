// Example of user-defined exception: BankInsufficientFundsException
import java.io.*;

public class BankInsufficientFundsException extends Exception {
   private double amount;
   
   public BankInsufficientFundsException(double amount) {
      this.amount = amount;
   }
   
   public double getAmount() {
      return amount;
   }
}
