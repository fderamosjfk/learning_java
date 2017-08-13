import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class TestTimeJunit {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test(timeout = 100)
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      // messageUtil.printMessage();     
      for(long i=0L; i<100_0000_000; i++) {
      }
      assertEquals(message,messageUtil.printMessage());
   }

   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi " + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}
