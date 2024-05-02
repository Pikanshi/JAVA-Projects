
package rectangletest;

class Rectangle {

    private double length, breadth;
    
    public Rectangle()
    {
        length = 1;
        breadth = 1;
    }
    
    public Rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }
    
    public Rectangle(double s)
    {
        length = breadth = s;
    }
    
    public double area()
    {
        return length * breadth;
    }
    
    public double perimeter()
    {
        return 2 * (length + breadth);
    }
    
    public boolean isSquare()
    {
        return (length == breadth);
    }
}

public class RectangleTest
{
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9);
        
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("Is Square: " + r.isSquare());
    }
    
}
