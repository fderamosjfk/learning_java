import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsTest {

   String message = "NorthCarolina";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test(dependsOnGroups = { "required[12]" })
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      Assert.assertEquals("NorthCarolina", messageUtil.printMessage());
      System.out.println();
   }

   @Test(groups = { "required1" })
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage(): before testPrintMessage()");
      Assert.assertEquals("Hi NorthCarolina", messageUtil.salutationMessage());
      System.out.println();
   }

   @Test(groups = { "required2" })
   public void initEnvironmentTest() {
      System.out.println("This is initEnvironmentTest: before testPrintMessage()\n");
   }

}
