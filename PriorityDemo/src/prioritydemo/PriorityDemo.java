
package prioritydemo;
import java.util.*;

class Comp implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2) return -1;
        else if(o1 < o2) return 1;
        return 0;
    }
}

public class PriorityDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comp());
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        
        pq.poll();
        
        for(Integer x : pq)
            System.out.println(x);
        
//        System.out.println(pq.peek());
    }
    
}
