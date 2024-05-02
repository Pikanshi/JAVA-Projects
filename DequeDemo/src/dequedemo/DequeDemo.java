
package dequedemo;
import java.util.*;

public class DequeDemo {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.addLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        
        dq.pollFirst();
//        for(Integer x : dq)
//            System.out.println(x);
        
//        dq.addFirst(1);
//        dq.offerFirst(2);
//        dq.offerFirst(3);
//        dq.offerFirst(4);
        
        for(Integer x : dq)
            System.out.println(x);
    }
    
}
