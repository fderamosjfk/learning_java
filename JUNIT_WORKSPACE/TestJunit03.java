import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TestJunit03 extends TestCase  {
   protected int intValue1;
   protected int intValue2;
   
   @Before 
   public void setUp() {
      intValue1 = 2;
      intValue2 = 3;
   }
	
   @Test
   public void testAdd() {
      //count the number of test cases
      System.out.println("No of Test Case = "+ this.countTestCases());
		
      //test getName 
      String name = this.getName();
      System.out.println("Test Case Name = "+ name);

      // check add
      assertEquals(intValue1 + 1, intValue2);

      //test setName
      this.setName("testNewAdd");
      String newName = this.getName();
      System.out.println("Updated Test Case Name = "+ newName);
   }
	
   /*
   public void testMinus() {
      //count the number of test cases
      System.out.println("No of Test Case = "+ this.countTestCases());

      // check minus
      assertEquals(intValue1, intValue2 - 1);
		
      //test getName 
      String name = this.getName();
      System.out.println("Test Case Name = "+ name);
   }
   */
	
   //tearDown used to close the connection or clean up activities
   public void tearDown(  ) {
   }
}
