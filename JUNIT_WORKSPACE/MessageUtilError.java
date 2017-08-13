/*
* This class prints the given message on console.
*/

public class MessageUtilError {

   private String message;

   //Constructor
   //@param message to be printed
	
   public MessageUtilError(String message){
      this.message = message;
   }
      
   // prints the message
   public String printMessage(){
      System.out.println("From class MessageUtilError printMessage(): [" +
                         message + "]");
      int number = 1/0; // division by zero ERROR
      return message;
   }   

   // add "Hi!" to the message
   public String salutationMessage(){
      message = "Hi " + message;
      System.out.println("From class MessageUtilError salutationMessage(): [" +
                         message + "]");
      System.out.println(message);
      return message;
   } 
}
