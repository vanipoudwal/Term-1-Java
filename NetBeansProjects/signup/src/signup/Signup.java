
package signup;

import java.awt.*;
import javax.swing.*;

public class Signup 
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Guddu");
        JPanel p = new JPanel();
        JLabel l = new JLabel("!!.*.*.*.*.*.*.*.*.*.*..SIGNUP..*.*.*.*.*.*.*.*.*.*.!!");
        l.setBounds(500,40,500,100);
        JLabel l1 = new JLabel("\nEnter Username");
        l1.setBounds(450,150,200,30);
        JTextField tf1 = new JTextField(20);
        tf1.setBounds(600,150,200,29);
        JLabel l2 = new JLabel("\nEnter Email Id");
        l2.setBounds(450,200,200,30);
        JTextField tf2 = new JTextField(20);
        tf2.setBounds(600,200,200,29);
        JLabel l3 = new JLabel("\nEnter Address");
        l3.setBounds(450,250,200,30);
        JTextField tf3 = new JTextField(20);
        tf3.setBounds(600,250,200,29);
        JLabel l4 = new JLabel("\nEnter Phone No.");
        l4.setBounds(450,300,200,30);
        JTextField tf4 = new JTextField(20);
        tf4.setBounds(600,300,200,29);
        JLabel l5 = new JLabel("\nSelect Country");
        l5.setBounds(450,350,200,30);
        String Country[] = {"US","India","China","Nepal","UK","England","Germany","London","Paris","New York"};
        JComboBox cb = new JComboBox(Country);
        cb.setBounds(600,350,200,29);
        JLabel l6 = new JLabel("\nSelect Gender");
        l6.setBounds(450,400,200,30);
        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBounds(600,400,100,32);
        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setBounds(700,400,100,32);
        JButton btn1 = new JButton("Submit");
        btn1.setBounds(450,460,155,33);
        JButton btn2 = new JButton("Cancel");
        btn2.setBounds(650,460,155,33);

        p.setLayout(null);
        f.add(p);
        p.add(l);
        p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(tf2);
        p.add(l3);
        p.add(tf3);
        p.add(l4);
        p.add(tf4);
        p.add(l5);
        p.add(cb);
        p.add(l6);
        p.add(rb1);
        p.add(rb2);
        p.add(btn1);
        p.add(btn2);
        f.setSize(200,200);
        f.setBackground(Color.magenta);
        f.setVisible(true);
    }
}
