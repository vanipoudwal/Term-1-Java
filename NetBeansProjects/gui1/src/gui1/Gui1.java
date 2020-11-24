
package gui1;

import java.awt.*;
import javax.swing.*;

public class Gui1
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("My Frame");
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenuItem mi1 = new JMenuItem("New");
        JMenuItem mi2 = new JMenuItem("Open");
        JPanel p = new JPanel();
        JCheckBox ch = new JCheckBox("niit");
        JTextField tf = new JTextField(20);
        JButton btn = new JButton("Submit");
        
       //     f.setMenuBar(mb);
            f.add(p);
            mb.add(m1);
            mb.add(m2);
            m1.add(mi1);
            m1.add(mi2);
            p.add(tf);
            p.add(ch);
            p.add(btn);
            f.setSize(200,200);
            f.setForeground(Color.red);
            f.setBackground(Color.green);
            f.setVisible(true);
    }
}
