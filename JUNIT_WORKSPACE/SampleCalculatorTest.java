import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SampleCalculatorTest {
  @Test
  public void evaluatesExpression() {
    SampleCalculator simpleCalculator = new SampleCalculator();
    int sum = simpleCalculator.evaluate("1+2+3");
    assertEquals(6, sum);
  }
}
