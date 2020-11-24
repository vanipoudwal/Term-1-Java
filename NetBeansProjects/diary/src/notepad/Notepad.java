
package notepad;

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

public class Notepad
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("Notepad");
        JPanel p = new JPanel();
      /* JLabel l1 = new JLabel("Username");
        l1.setBounds(425,125,200,30);
        JTextField tf1 = new JTextField(20);
        tf1.setBounds(625,125,200,30);
        JLabel l2 = new JLabel("Password");
        l2.setBounds(425,195,200,30);
        JTextField tf2 = new JTextField(20);
        tf2.setBounds(625,195,200,30);
        JButton btn1 = new JButton("Submit");
        btn1.setBounds(425,275,190,35);
        JButton btn2 = new JButton("Cancel");
        btn2.setBounds(630,275,190,35); */
        JTextArea ta = new JTextArea();

        String username = "vani";
        String password = "niit";
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the username :: ");
	String uname = sc.next();
	System.out.print("Enter the password :: ");
	String pwd = sc.next();

        if(username.equals(uname) && password.equals(pwd))
	{
            System.out.println("Heya.!! Welcome to my notepad.!!");
	}
	else
	{
            System.out.println("Sorry.!! You've entered wrong details.!!");
            System.exit(0);
	}

        p.setLayout(null);
        f.add(p);
      /* p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(tf2);
        p.add(btn1);
        p.add(btn2); */
        p.add(ta);
        f.setSize(500,400);
        f.setForeground(Color.red);
        f.setBackground(Color.green);
        f.setVisible(true);
    }
}
