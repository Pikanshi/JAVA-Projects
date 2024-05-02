
package scinterface;

class Store
{
    Member[] mem = new Member[100];
    int count = 0;
    
    void register(Member m) {
        mem[count++] = m;
    }
    void inviteSale() {
        for(int i = 0; i < count; i++)
            mem[i].callBack();
    }
}

interface Member
{
    void callBack();
}

class Customer implements Member
{
    String name;
    public Customer(String n) {
        name = n;
    }
    
    @Override
    public void callBack() {
        System.out.println("OK, I will visit - " + name);
    }
}

public class SCInterface {

    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");
        
        s.register(c1);
        s.register(c2);
        s.inviteSale();
        
    }
    
}
