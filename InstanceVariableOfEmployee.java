/**
 * Illustrates public and private instance variables of a class.
 */
import java.io.*;
public class InstanceVariableOfEmployee {

   // this instance variable is visible for any child class.
   public String name;

   // salary  variable is visible in Employee class only.
   private double salary;

   // The name variable is assigned in the constructor.
   public InstanceVariableOfEmployee (String empName) {
      name = empName;
   }

   // The salary variable is assigned a value.
   public void setSalary(double empSal) {
      salary = empSal;
   }

   // This method prints the employee details.
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

   public static void main(String args[]) {
      InstanceVariableOfEmployee empOne = new InstanceVariableOfEmployee("Ransika");
      empOne.setSalary(1000);
      empOne.printEmp();
   }
}
