import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class JunitOnTestNG {
   @Test
   public void testAdd() {
      String str = "Junit testing using TestNG";
      assertEquals("Junit testing using TestNG", str);
   }
}
