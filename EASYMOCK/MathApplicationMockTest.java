import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(EasyMockRunner.class)
public class MathApplicationMockTest {
	
   // @TestSubject annotation is used to identify class which is going to use the mock object
   @TestSubject
   MathApplication mathApplication = new MathApplication();

   //@Mock annotation is used to create the mock object to be injected
   @Mock
   CalculatorService calcService;

   @Test
   public void testMath(){
      //add the behavior of calc service to add two numbers
      EasyMock.expect(calcService.add(10.0,20.0)).andReturn(30.00);

      //add the behavior of calc service to subtract two numbers
      EasyMock.expect(calcService.subtract(10.0,20.0)).andReturn(-10.00);

      //add the behavior of calc service to multiply two numbers
      EasyMock.expect(calcService.multiply(10.0,20.0)).andReturn(200.00);

      //add the behavior of calc service to divide two numbers
      EasyMock.expect(calcService.divide(10.0,20.0)).andReturn(0.50);

      //activate the mock
      EasyMock.replay(calcService);	
		
      //test the add functionality
      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);

      //test the subtract functionality
      Assert.assertEquals(mathApplication.subtract(10.0, 20.0),-10.0,0);

      //test the multiply functionality
      Assert.assertEquals(mathApplication.multiply(10.0, 20.0),200.0,0);

      //test the divide functionality
      Assert.assertEquals(mathApplication.divide(10.0, 20.0),0.50,0);

      //verify call to calcService is made or not
      EasyMock.verify(calcService);
   }
}
