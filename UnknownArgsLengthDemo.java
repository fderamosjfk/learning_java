public class UnknownArgsLengthDemo {
    public static String makeAString(char... charParam) {
        String result = "";
        System.out.println("Length of char args: " + charParam.length);
        for(char ch: charParam) {
            result += ch;
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(makeAString('a', 'b', 'c', 'd', 'e'));
        System.out.println(makeAString('a', 'b', 'c', 'd', 'e',
                                       'f', 'g', 'h', 'i', 'j'));
        System.out.println(makeAString('a', 'b', 'c', 'd', 'e',
                                       'f', 'g', 'h', 'i', 'j',
                                       'k', 'l', 'm'));
    }
}
