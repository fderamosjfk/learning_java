// Makes use of following programs:
//     BankCheckingAccount.java  BankInsufficientFundsException.java

public class BankTransactionDemo {

   public static void main(String [] args) {
      BankCheckingAccount c = new BankCheckingAccount(101);
      System.out.println("Depositing $500...");
      c.deposit(500.00);
      
      try {
         System.out.println("\nWithdrawing $100...");
         c.withdraw(100.00);
         System.out.println("\nWithdrawing $600...");
         c.withdraw(600.00);
      } catch (BankInsufficientFundsException e) {
         System.out.println("Sorry, but you are short of $" + e.getAmount());
         e.printStackTrace();
      }
   }
}
