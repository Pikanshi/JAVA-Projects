
package swingtextfield;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import javax.swing.text.*;

class MyFrame extends JFrame
{   
    MyFrame() {
        super("Swing TextField Demo");
        JTextField tf1 = new JTextField(20);
        
        DateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField tf2 = new JFormattedTextField(df);
        tf2.setColumns(20);
        tf2.setValue(new Date());
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        JFormattedTextField tf3 = new JFormattedTextField(nft);
        tf3.setColumns(20);
        tf3.setValue(0);
        
        JTextArea ta = new JTextArea(30,30);
        ta.getText();
        
        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);
        add(ta);
    }


}

public class SwingTextField {

    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(500, 500);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
