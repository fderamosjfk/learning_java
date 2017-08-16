import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeDetailsTest {
   EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
   EmployeeDetails employee = new EmployeeDetails("Abraham Washington", 8000, 59);

   @Test
   public void testCalculateAppriasal() {
   
      double appraisal = empBusinessLogic.calculateAppraisal(employee);
      Assert.assertEquals(500, appraisal, 0.0, "500");
   }

   // Test to check yearly salary
   @Test
   public void testCalculateYearlySalary() {
   
      double salary = empBusinessLogic.calculateYearlySalary(employee);
      Assert.assertEquals(96000, salary, 0.0, "8000");
   }
}
