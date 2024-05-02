
package listdemo;
import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();
        LinkedList<Integer> al2 = new LinkedList<>(List.of(50,60,70,80,90));
        al1.add(10);
        al1.add(0, 5);
        al1.addAll(1, al2);
        al1.add(5, 70);
        al1.set(6, 100);
        
        for(ListIterator<Integer> it = al1.listIterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
    
}
