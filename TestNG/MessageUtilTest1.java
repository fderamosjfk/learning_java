import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageUtilTest1 {
   String message = "George";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      Assert.assertEquals(message, messageUtil.printMessage());
   }
}
