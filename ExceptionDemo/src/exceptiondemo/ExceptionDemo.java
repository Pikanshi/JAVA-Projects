
package exceptiondemo;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException e) {
            System.out.println("Denominator should not be zero, try again!!");
        }
        
        System.out.println("Bye");
    }
    
}
