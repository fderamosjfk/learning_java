import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageUtilTest {
	
   String message = "Hello TestNG";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      Assert.assertEquals(message, messageUtil.printMessage());
   }
}
