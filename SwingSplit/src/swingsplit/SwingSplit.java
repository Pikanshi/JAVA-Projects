
package swingsplit;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ListSelectionListener
{
    JSplitPane sp;
    JList list;
    JLabel l;
    
    MyFrame() {
        super("Swing Split Frame Demo");
        String cols[] = {"RED", "GREEN", "BLUE", "YELLOW", "ORANGE", "MAGENTA", "BLACK"};
        
        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1 = new JScrollPane(list);
        
        l = new JLabel(" ");
        l.setOpaque(true);
        l.setBackground(Color.red);
        JScrollPane p2 = new JScrollPane(l);
        
//        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p1, p2);
//        sp.setDividerLocation(200);
//        add(sp);
        JTabbedPane tp = new JTabbedPane();
        tp.addTab("Colors", p1);
        tp.addTab("Label", p2);
        add(tp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String str = (String)list.getSelectedValue();
        
        switch(str) {
            case "RED" : l.setBackground(Color.red);
                            break;
            case "GREEN" : l.setBackground(Color.green);
                            break;
            case "BLUE" : l.setBackground(Color.blue);
                            break;
            case "YELLOW" : l.setBackground(Color.yellow);
                            break;
            case "ORANGE" : l.setBackground(Color.orange);
                            break;
            case "MAGENTA" : l.setBackground(Color.magenta);
                            break;
            case "BLACK" : l.setBackground(Color.black);
                            break;
        }
    }
}

public class SwingSplit {

    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(800, 800);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
