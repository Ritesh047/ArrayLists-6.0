import java.util.ArrayList;
import java.util.Iterator;
public class Create{
public static void main(String[]args){
// Create an Object for ArrayList
  // Iterate it by usig Iterator and While Loops
     
  // Create an Object for ArrayList
        ArrayList<String> a = new ArrayList<>();

        // Load Values in ArrayList
        a.add("Ritesh");
        a.add("Ritu");
        a.add("Bala");

        // Iterate it using Iterator and While Loops
        Iterator<String> iterator = a.iterator();
        
        // using while loop
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        
    }
}
}
