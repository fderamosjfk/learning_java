import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestMessageUtilErrorJunit {

   String message = "Robert";	
   MessageUtilError messageUtilError = new MessageUtilError(message);
   
   @Test(expected = ArithmeticException.class)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      assertEquals(message, messageUtilError.printMessage());     
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi " + "Robert";
      assertEquals(message, messageUtilError.salutationMessage());
   }
}
