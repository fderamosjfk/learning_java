/*
 * Create file mytest.txt and write given numbers in binary format.
 * Same would be the output on the stdout screen.
*/
import java.io.*;

public class InputOutputStreamDemo {

   public static void main(String args[]) {
   
      try {
         byte bWrite [] = {9,7,95,11,21,3,40,5};
         OutputStream os = new FileOutputStream("mytest.txt");
         for(int x = 0; x < bWrite.length ; x++) {
            os.write( bWrite[x] );   // writes the bytes
         }
         os.close();
     
         InputStream is = new FileInputStream("mytest.txt");
         int size = is.available();

         for(int i = 0; i < size; i++) {
            System.out.print((char)is.read() + "  ");
         }
         is.close();
      }catch(IOException e) {
         System.out.print("Exception");
      }	
   }
}
