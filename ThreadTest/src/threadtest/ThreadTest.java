
package threadtest;

class MyThread extends Thread
{
    @Override
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + ": Hello Thread");
            i++;
        }
    }
}

class MyThread2 implements Runnable
{
    @Override
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + ": Hi Runnable");
            i++;
        }
    }
}

public class ThreadTest extends Thread {
    
    public void run() {
        int k = 1;
        while(true) {
            System.out.println(k + ": Hello in Test");
            k++;
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        
        MyThread2 mt2 = new MyThread2();
        Thread t = new Thread(mt2);
        t.start();
        
        ThreadTest tt = new ThreadTest();
        tt.start();
        
        int j = 1;
        while(true) {
            System.out.println(j + ": World");
            j++;
        }
    }
    
}
