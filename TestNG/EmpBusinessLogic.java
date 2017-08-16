public class EmpBusinessLogic {

   // Calculate the yearly salary of employee
   public double calculateYearlySalary(EmployeeDetails employeeDetails){
      double yearlySalary = employeeDetails.getMonthlySalary() * 12;
      return yearlySalary;
   }
	
   // Calculate the appraisal amount of employee
   public double calculateAppraisal(EmployeeDetails employeeDetails){
   
      double appraisal;
      
      if(employeeDetails.getMonthlySalary() < 10000){
         appraisal = 500;
         
      } else {
         appraisal = 1000;
      }
      
      return appraisal;
   }
}
