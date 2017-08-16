/*
ferdy01@ferdy-390:~/learning_java/TestNG$ javac SampleNgAnnotationTest.java
ferdy01@ferdy-390:~/learning_java/TestNG$ java  org.testng.TestNG SampleNgAnnotationTestNG.xml
*/

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleNgAnnotationTest {

   // test case 1
   @Test
   public void testCase1() {
      System.out.println("\t\t\t\tin test case 1");
   }

   // test case 2
   @Test
   public void testCase2() {
      System.out.println("\t\t\t\tin test case 2");
   }

   @BeforeMethod
   public void beforeMethod() {
      System.out.println("\t\t\tin beforeMethod");
   }

   @AfterMethod
   public void afterMethod() {
      System.out.println("\t\t\tin afterMethod");
   }

   @BeforeClass
   public void beforeClass() {
      System.out.println("\t\tin beforeClass");
   }

   @AfterClass
   public void afterClass() {
      System.out.println("\t\tin afterClass");
   }

   @BeforeTest
   public void beforeTest() {
      System.out.println("\tin beforeTest");
   }

   @AfterTest
   public void afterTest() {
      System.out.println("\tin afterTest");
   }

   @BeforeSuite
   public void beforeSuite() {
      System.out.println("in beforeSuite");
   }

   @AfterSuite
   public void afterSuite() {
      System.out.println("in afterSuite");
   }

}

/*
in beforeSuite
in beforeTest
in beforeClass
in beforeMethod
in test case 1
in afterMethod
in beforeMethod
in test case 2
in afterMethod
in afterClass
in afterTest
in afterSuite

*/
