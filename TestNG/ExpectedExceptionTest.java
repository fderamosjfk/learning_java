import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionTest {
   String message = "Barack";	
   ErrorMessageUtil messageUtil = new ErrorMessageUtil(message);
	   
   @Test(expectedExceptions = ArithmeticException.class)
   public void testDivisionByZero() {	
      System.out.println("Inside testDivisionByZero()");     
      messageUtil.printMessage();     
   }
   
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi " + "Barack";
      Assert.assertEquals(message, messageUtil.salutationMessage());
   }
}
