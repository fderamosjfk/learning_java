import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageUtilTest2 {
   String message = "Barack";	
   MessageUtil messageUtil = new MessageUtil(message);
	 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Barack";
      Assert.assertEquals(message,messageUtil.salutationMessage());
   }
}
