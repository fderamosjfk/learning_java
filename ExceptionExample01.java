/*
 * Using Exception.
*/

import java.io.*;

public class ExceptionExample01 {

   public static void main(String args[]) {

      int[] a = new int[2];
      try {
         System.out.println("Access NON-EXISTING element three :" + a[3]);
      } catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      } finally {
         System.out.println("Start of finally statement...");
         a[0] = 6;
         System.out.println("First element value: " + a[0]);
         System.out.println("The finally statement is executed");
      }

      System.out.println("Out of the block");

   }
}
