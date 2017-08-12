import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunitVersion01 {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      message = "New World";
      assertEquals(message,messageUtil.printMessage());
   }
}
