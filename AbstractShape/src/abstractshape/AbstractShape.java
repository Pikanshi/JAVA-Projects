
package abstractshape;

abstract class Shape
{
    abstract double perimeter();
    abstract double area();
}

class Circle extends Shape
{
    double radius;
    
    public Circle(double r) {
        radius = r;
    }
    
    public double perimeter() {
        return Math.PI * radius * 2;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    double length, breadth;
    
    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    
    public double perimeter() {
        return 2 * (length + breadth);
    }
    
    public double area() {
        return length * breadth;
    }
}

public class AbstractShape {

    public static void main(String[] args) {
        Shape s1 = new Circle(8.5);
        System.out.println("Circle area: " + s1.area());
        System.out.println("Circle perimeter: " + s1.perimeter());
        
        Shape s2 = new Rectangle(19.2, 6.8);
        System.out.println("Rectangle area: " + s2.area());
        System.out.println("Rectangle perimeter: " + s2.perimeter());
    }
    
}
