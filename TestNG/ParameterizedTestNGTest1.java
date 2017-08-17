import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTestNGTest1 {
   @Test
   @Parameters("myName")
   public void testParameter(String myName) {
      System.out.println("Parameterized value myName is   : " + myName);
   }
}
