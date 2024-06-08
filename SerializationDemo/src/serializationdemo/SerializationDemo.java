
package serializationdemo;
import java.io.*;

class Student implements Serializable
{
    private int rollNo;
    private String name;
    private float avg;
    private String dept;
    public static int Data = 10;
    public transient int t;
    
    public Student(){}
    public Student(int r, String n, float a, String d) {
        rollNo = r;
        name = n;
        avg = a;
        dept = d;
        Data = 500;
        t = 500;
    }
    
    @Override
    public String toString() {
        return "\nStudents Details\n\nRoll No: " + rollNo +
                "\nName: " + name + "\nAvg: " + avg + "\nDept: " + dept +
                "\nData: " + Data + "\nTransient: " + t + "\n";
    }
}

public class SerializationDemo {

    /*public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("Student1.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        Student s = new Student(10, "John", 80.50f, "CSE");
        oos.writeObject(s);
        
        oos.close();
        fos.close(); 
    }*/
    
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Student1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Student s = (Student)ois.readObject();
        System.out.println(s);
        
        ois.close();
        fis.close();
    }
    
}
