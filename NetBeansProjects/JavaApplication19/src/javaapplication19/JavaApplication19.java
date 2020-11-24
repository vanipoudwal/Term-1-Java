
package javaapplication19;

import java.awt.*;
import javax.swing.*;

public class JavaApplication19
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Vani");
        JLabel l1 = new JLabel("Username");
        JTextField tf1 = new JTextField(20);
        JLabel l2 = new JLabel("Password");
        JTextField tf2 = new JTextField(20);
        JPanel p = new JPanel();
        JButton btn = new JButton("Submit");
      
            f.add(p);
            p.add(l1);
            p.add(tf1);
            p.add(l2);
            p.add(tf2);
            p.add(btn);
            f.setSize(200,200);
            f.setForeground(Color.red);
            f.setBackground(Color.green);
            f.setVisible(true);
    }
}
