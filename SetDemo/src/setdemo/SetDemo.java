
package setdemo;
import java.util.*;

class Point implements Comparable
{
    int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
    public int compareTo(Object o)
    {
        Point p = (Point)o;
        if(this.x < p.x)
            return -1;
        else if(this.x > p.x)
            return 1;
        else {
            if(this.y < p.y)
                return -1;
            else if(this.y > p.y)
                return 1;
            else
                return 0;
        }
    }
}

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(20);
        hs.add(10);
        hs.add(30);
        hs.add(10);
        
        System.out.println(hs);
        
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));
        System.out.println(ts);
        
    }
    
}
