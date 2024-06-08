
package firstapp;
import java.awt.*;

class MyFrame extends Frame
{
    Button b;
    Label l;
    TextField tf;
    
    public MyFrame() {
        super("My App");
        setLayout(new FlowLayout());
        l = new Label("Name");
        tf = new TextField(20);
        b = new Button("OK");
        
        add(l);
        add(tf);
        add(b);
    }
}

public class FirstApp {

    public static void main(String[] args) {
        /*Frame f = new Frame("My First App");
        f.setLayout(new FlowLayout());
        
        Button b = new Button("OK");
        Label l = new Label("Name");
        TextField tf = new TextField(20);
        f.add(l);
        f.add(tf);
        f.add(b);
        
        f.setSize(300,300);
        f.setVisible(true);*/
        
        MyFrame mf = new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
    
}
