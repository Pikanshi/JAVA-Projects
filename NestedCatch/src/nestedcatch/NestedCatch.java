
package nestedcatch;

public class NestedCatch {

    public static void main(String[] args) {
        int A[] = {30, 20, 10, 0, 80};
        
        try {
            try {
                int c = A[0] / A[3];
                System.out.println("Result: " + c);
            }
            catch(ArithmeticException e) {
                System.out.println("Denominator is zero, try again!!");
            }
            System.out.println(A[9]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
        System.out.println("Bye");
    }
    
}
