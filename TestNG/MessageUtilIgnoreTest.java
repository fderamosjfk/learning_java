import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageUtilIgnoreTest {
   String message = "Barack";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      message = "Barack";
   Assert.assertEquals(message, messageUtil.printMessage());
   }

   @Test(enabled = false)
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Barack";
      Assert.assertEquals(message, messageUtil.salutationMessage());
   }
}
