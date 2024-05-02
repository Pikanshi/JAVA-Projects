
package scinterprocess;

class WhiteBoard
{
    String text;
    int noOfStudents, count = 0;
//    boolean flag = true;
    
    synchronized public void write(String msg) {
        System.out.println("Teacher is writing: " + msg);
        while(count != 0)
            try { wait(); } catch(Exception e) {}
        text = msg;
        count = noOfStudents;
        notifyAll();
    }
    
    synchronized public String read() {
        while(count == 0)
            try { wait(); } catch(Exception e) {}
        String st = text;
        count--;
        if(count == 0)
            notify();
        return st;
    }
    
    public void attendance() {
        noOfStudents++;
    }
}

class Teacher extends Thread
{
    WhiteBoard wb;
    String notes[] = {"Java is a language", "It follows OOPs concepts", "It is platform-independent", "It supports Thread", "end"};
    public Teacher(WhiteBoard w) {
        wb = w;
    }
    
    public void run() {
        for(int i = 0; i < notes.length; i++) {
            wb.write(notes[i]);
        }
    }
}

class Student extends Thread
{
    WhiteBoard wb;
    String str, name;
    public Student(String n, WhiteBoard w) {
        name = n;
        wb = w;
    }
    
    public void run() {
        String text;
        wb.attendance();
        do {
            text = wb.read();
            System.out.println(name + " is reading " + text);
            System.out.flush();
        } while(!text.equals("end"));
    }
}

public class SCInterProcess {

    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);
        Student st1 = new Student("1. John", wb);
        Student st2 = new Student("2. Alex", wb);
        Student st3 = new Student("3. Brandon", wb);
        Student st4 = new Student("4. Smith", wb);
        
        t.start();
        st1.start();
        st2.start();
        st3.start();
        st4.start();
    }
    
}
