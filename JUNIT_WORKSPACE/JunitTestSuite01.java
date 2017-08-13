import junit.framework.*;

public class JunitTestSuite01 {
   public static void main(String[] a) {
      // add the test's in the suite
      TestSuite suite = new TestSuite(TestJunit.class, TestJunitVersion01.class, TestJunit02.class,
                                      TestJunit03.class, TestJunit04.class);
      TestResult result = new TestResult();
      suite.run(result);
      System.out.println("Number of test cases = " + result.runCount());
   }
}
