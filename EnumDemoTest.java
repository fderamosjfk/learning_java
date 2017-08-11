/**
 * Illustrates the use of enum.
 */
 
class Soda {
    enum SodaSize{SMALL, MEDIUM, LARGE};
    SodaSize size;
}

public class EnumDemoTest {
    public static void main(String[] args) {
        Soda s = new Soda();
        s.size = Soda.SodaSize.LARGE;
        System.out.println("Size: " + s.size);
    }
}
