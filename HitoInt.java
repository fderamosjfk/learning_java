package hitobito;

public class HitoInt implements Hito {

   public void eat() {
      System.out.println("Hito eats");
   }

   public void travel() {
      System.out.println("Hito travels");
   } 

   public int noOfLegs() {
      return 2;
   }

   public static void main(String args[]) {
      HitoInt h = new HitoInt();
      h.eat();
      h.travel();
   }
} 
