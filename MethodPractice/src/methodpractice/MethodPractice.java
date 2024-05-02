
package methodpractice;

public class MethodPractice {

    static double area(double radius) {
        return Math.PI * radius * radius;
    }
    
    static double area(double length, double breadth) {
        return length * breadth;
    }
    
    static double area(double height, double a, double b) {
        return (a + b) * height / 2;
    }
    
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(9, 7));
        System.out.println(area(3.5, 7, 8.9));
    }
    
}
