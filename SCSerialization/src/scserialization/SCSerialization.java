
package scserialization;
import java.io.*;
import java.util.Scanner;

class Customer implements Serializable
{
    String custID, name, phone;
    static int count = 1;
    
    public Customer(){}
    public Customer(String n, String p) {
        custID = "C" + count++;
        name = n;
        phone = p;
    }
    
    @Override
    public String toString() {
        return "ID: " + custID + ", Name: " + name + ", Phone: " + phone + "\n";
    }
}

public class SCSerialization {

    /*public static void main(String[] args) throws Exception {
        Customer list[] = {new Customer("Smith", "7809376798"), new Customer("John", "8987783000"), new Customer("Alex", "9889234784")};
        FileOutputStream fos = new FileOutputStream("Customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeInt(list.length);
        for(Customer c : list)
            oos.writeObject(c);
        
        oos.close();
        fos.close();
    } */
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        int len = ois.readInt();
        Customer list[] = new Customer[len];
        for(int i = 0; i < len; i++) {
            list[i] = (Customer)ois.readObject();
        }
        
        System.out.println("Enter name of Customer: ");
        String name = sc.nextLine();
        
        for(int i = 0; i < len; i++) {
            if(name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i]);
        }
        
        ois.close();
        fis.close();
    }
}
