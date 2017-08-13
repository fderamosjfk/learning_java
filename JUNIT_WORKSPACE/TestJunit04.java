import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class TestJunit04 extends TestResult {
   // add the error
   public synchronized void addError(Test test, Throwable t) {
      super.addError((junit.framework.Test) test, t);
   }

   // add the failure
   public synchronized void addFailure(Test test, AssertionFailedError t) {
      super.addFailure((junit.framework.Test) test, t);
   }
	
   @Test
   public void testAdd() {
      // add any test
      assertEquals(1+2, 3);
      assertEquals(1+2, 3+0);
   }
   
   // Marks that the test run should stop.
   public synchronized void stop() {
      //stop the test here
   }
}
