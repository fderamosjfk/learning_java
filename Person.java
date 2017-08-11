/**
 * Illustrates class Person.
 */

public class Person {
   int personAge;
   String personName;

   public Person(String name) {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
      personName = name;
   }

   public void setAge( int age ) {
      personAge = age;
   }

   public int getAge( ) {
      System.out.println("Person " + personName + "'s age is :" + personAge );
      return personAge;
   }

   public static void main(String []args) {
      /* Object creation */
      Person myPerson = new Person( "Ferdinand" );
      int age;

      /* Call class method to set person's age */
      myPerson.setAge( 59 );

      /* Call another class method to get person's age */
      age = myPerson.getAge( );
      System.out.println("Within main(): age = " + age);

      /* You can access instance variable as follows as well */
      System.out.println("Age Value :" + myPerson.personAge );
   }
}
