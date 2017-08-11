/**
 * Illustrates use of parameter array.
 */

public class ArrayParameterDemo {
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
              System.out.print(array[i] + " ");
        }
    }    
    
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5};
        for(int number: numbers) {
            System.out.println(number);
        }
        printArray(numbers);
    }
}
