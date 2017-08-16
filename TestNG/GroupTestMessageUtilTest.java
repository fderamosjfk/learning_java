import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestMessageUtilTest {
   String message = ".net";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test(groups = { "functest", "checkintest" })
   
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      message = ".net";
      Assert.assertEquals(message, messageUtil.printMessage());
   }

   @Test(groups = { "checkintest" })
   
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi Barack";
      Assert.assertNotEquals(message, messageUtil.salutationMessage());
   }

   @Test(groups = { "functest" })
   
   public void testingExitMessage() {
      System.out.println("Inside testExitMessage()");
      System.out.println("Inside testExitMessage() : " + messageUtil.exitMessage());
      message = "www." + "inquirer"+".net";
      Assert.assertEquals(message, messageUtil.exitMessage());
   }  
}
