
package sccollection;
import java.io.*;
import java.util.*;

class Account
{
    String accNo, name;
    double balance;
    
    public Account(String acc, String n, double b) {
        accNo = acc;
        name = n;
        balance = b;
    }
    
    @Override
    public String toString() {
        return "Account No: " + accNo + ", Name: " + name + ", Balance: " + balance + "\n";
    }
}

public class SCCollection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
    
}
