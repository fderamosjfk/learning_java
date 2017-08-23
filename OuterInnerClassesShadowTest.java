public class OuterInnerClassesShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("OuterInnerClassesShadowTest.this.x = " +
                                       OuterInnerClassesShadowTest.this.x);
        }
    }

    public static void main(String... args) {
        OuterInnerClassesShadowTest st = new OuterInnerClassesShadowTest();
        OuterInnerClassesShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
