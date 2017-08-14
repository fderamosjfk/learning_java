public class UseOfKeywordThis {
   // Instance variable num
   private int num = 10; // default value
	
   UseOfKeywordThis() {
      System.out.println("This is an example program on keyword this");	
   }

   UseOfKeywordThis(int num) {
      // Invoking the default constructor
      this();
      
      // Assigning the local variable num to the instance variable num
      this.num = num;	   
   }
   
   public void greet() {
      System.out.println("Hello from keyword this!");
   }
      
   public void print() {
      // Local variable num
      int num = 20;
      
      // Printing the local variable
      System.out.println("value of local variable num is : " + num);
      
      // Printing the instance variable
      System.out.println("value of instance variable num is : " + this.num);
      
      // Invoking the greet method of a class
      this.greet();     
   }
   
   public static void main(String[] args) {
      // Instantiating the class
      UseOfKeywordThis obj1 = new UseOfKeywordThis();
      
      // Invoking the print method
      obj1.print();
      
      System.out.println();
	  
      // Passing a new value to the num variable through parametrized constructor
      UseOfKeywordThis obj2 = new UseOfKeywordThis(30);
      
      // Invoking the print method again
      obj2.print(); 
   }
}
