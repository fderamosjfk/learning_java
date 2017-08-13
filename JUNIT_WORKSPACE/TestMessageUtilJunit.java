import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class TestMessageUtilJunit {
	
   String message1 = "Hello Earth";	
   MessageUtil messageUtil = new MessageUtil(message1);

   @Test
   public void testPrintMessage() {
      String message2 = "Hello World";	
      assertNotEquals(message2, messageUtil.printMessage());
   }
}
