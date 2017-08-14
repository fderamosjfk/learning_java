import java.io.*;

public class CopyFileDemo01 {

   public static void main(String args[]) throws IOException {  
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("CopyFileDemo_myinput.txt");
         out = new FileWriter("CopyFileDemo_myoutput.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
