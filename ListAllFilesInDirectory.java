/*
 * List all files and directories under /tmp directory.
*/
import java.io.File;

public class ListAllFilesInDirectory {

   public static void main(String[] args) {
      File file = null;
      String[] paths;
  
      try {      
         // create new file object
         file = new File("/tmp");

         // array of files and directory
         paths = file.list();

         // for each name in the path array
         System.out.println("Contents of /tmp directory:");
         for(String path:paths) {
            // prints filename and directory name
            System.out.println("\t" + path);
         }
      }catch(Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
   }
}
