
package scsynchronization;

class ATM        
{
    synchronized public void checkBalance(String name) {
        System.out.print(name + " checking ");
        try { Thread.sleep(1000); } catch(Exception e) {}
        System.out.println("balance");
    }
    
    synchronized public void withdraw(String name, double amount) {
        System.out.print(name + " withdrawing ");
        try { Thread.sleep(1000); } catch(Exception e) {}
        System.out.println(amount);
    }
}

class Customer extends Thread
{
    ATM atm;
    String name;
    double amount;
    
    public Customer(String n, ATM a, double amt) {
        name = n;
        atm = a;
        amount = amt;
    }
    
    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    @Override
    public void run() {
        useATM();
    }
}

public class SCSynchronization {

    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("John", atm, 9000.50);
        Customer c2 = new Customer("Smith", atm, 8900.20);
        Customer c3 = new Customer("Alex", atm, 6000.00);
        Customer c4 = new Customer("Brandon", atm, 10920.87);
        
        c1.start();
        c2.start();
        c3.start();
        c4.start(); 
    }
}
