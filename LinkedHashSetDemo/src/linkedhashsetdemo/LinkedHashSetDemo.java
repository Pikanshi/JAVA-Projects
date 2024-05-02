
package linkedhashsetdemo;
import java.util.*;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        
        lhs.add("A");
        lhs.add("C");
        lhs.add("E");
        lhs.add("K");
        lhs.add("B");
        lhs.add("G");
        
        lhs.forEach(System.out::println);
    }
    
}
