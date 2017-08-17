/*
* This class prints the given message on console.
*/

public class MessageUtil {
   private String message;

   // Constructor
   // @param message to be printed
   public MessageUtil(String message) {
      this.message = message;
   }

   // prints the message
   public String printMessage() {
      System.out.println(message);
      return message;
   }

   // add "Hi " to the message
   public String salutationMessage() {
      String messageWithHi = "Hi " + message;
      System.out.println(messageWithHi);
      return messageWithHi;
   }


   // add "www.inquirer" to the message
   public String exitMessage() {
      String messageWithWWW = "www.inquirer" + message;
      System.out.println(messageWithWWW);
      return messageWithWWW;
   }
}
