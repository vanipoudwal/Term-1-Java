
package javaapplication23;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JavaApplication23 
{
        static Label l1 = new Label("Enter First Number :: ");
        static TextField tf1 = new TextField(30);
        static Label l2 = new Label("Enter Second Number :: ");
        static TextField tf2 = new TextField(30);
        static Label l3 = new Label("Result :: ");
        static TextField tf3 = new TextField(30);
         
    public static void main(String[] args) 
    {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());
        Button btn1 = new Button("addition");
        btn1.addActionListener(new javaApplication231());
        Button btn2 = new Button("subtract");
        btn2.addActionListener(new javaApplication232());
        Button btn3 = new Button("multiply");
        btn3.addActionListener(new javaApplication233());
        Button btn4 = new Button("division");
        btn4.addActionListener(new javaApplication234());
       
       f.add(l1);
       f.add(tf1);
       f.add(l2);
       f.add(tf2);
       f.add(l3);
       f.add(tf3);
       f.add(btn1);
       f.add(btn2);
       f.add(btn3);
       f.add(btn4);
       f.setVisible(true);
    }
}

class javaApplication231 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
        String m = JavaApplication23.tf1.getText();
        String n = JavaApplication23.tf2.getText();
        int a = Integer.parseInt(m);
        int b = Integer.parseInt(n);
        String c = String.valueOf(a+b);
        JavaApplication23.tf3.setText(c);
    }
}

class javaApplication232 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");            
        String m = JavaApplication23.tf1.getText();
        String n = JavaApplication23.tf2.getText();
        int a = Integer.parseInt(m);
        int b = Integer.parseInt(n);
        String c = String.valueOf(a-b);
        JavaApplication23.tf3.setText(c);
    }
}

class javaApplication233 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
        String m = JavaApplication23.tf1.getText();
        String n = JavaApplication23.tf2.getText();
        int a = Integer.parseInt(m);
        int b = Integer.parseInt(n);
        String c = String.valueOf(a*b);
        JavaApplication23.tf3.setText(c);
    }
}
        
class javaApplication234 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");           
        String m = JavaApplication23.tf1.getText();
        String n = JavaApplication23.tf2.getText();
        int a = Integer.parseInt(m);
        int b = Integer.parseInt(n);
        String c = String.valueOf(a/b);
        JavaApplication23.tf3.setText(c);
    }
}
