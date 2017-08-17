import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsTest {

   String message = "NorthCarolina";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      Assert.assertEquals("NorthCarolina", messageUtil.printMessage());
   }

   @Test(dependsOnMethods = { "initEnvironmentTest" })
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      Assert.assertEquals("Hi NorthCarolina", messageUtil.salutationMessage());
   }

   @Test
   public void initEnvironmentTest() {
      System.out.println("This is initEnvironmentTest");
   }

}
