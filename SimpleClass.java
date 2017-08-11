/**
 * Illustrates a simple or basic class in java.
 */

public class SimpleClass {
   public SimpleClass(String name) {
      // This constructor has one parameter, name.
      System.out.println("Passed Name is :" + name);
   }

   public static void main(String []args) {
      // Following statement would create an object myPuppy
      SimpleClass mySimpleClass = new SimpleClass( "SimpleClass" );
   }
}
