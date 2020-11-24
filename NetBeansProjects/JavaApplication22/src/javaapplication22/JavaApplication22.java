
package javaapplication22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaApplication22 
{
    static Label l1 = new Label("Enter the no.");
    static TextField tf1 = new TextField(20);
    static Label l2 = new Label("Result");
    static TextField tf2 = new TextField(20);
    
    public static void main(String[] args) 
    {
       JFrame f = new JFrame();
       JPanel p = new JPanel();
       f.setLayout(new FlowLayout());
       Button btn = new Button("result");
       btn.addActionListener(new javaApplication221());
       
       f.add(p);
       p.setLayout(null);
       f.add(l1);
       f.add(tf1);
       f.add(btn);
       f.add(l2);
       f.add(tf2);
       f.setVisible(true);  
    }    
}

class javaApplication221 implements ActionListener
{
    @Override
        public void actionPerformed(ActionEvent e)
    {
            //throw new UnsupportedOperationException("Not supported yet");
            
        String m = JavaApplication22.tf1.getText();
        int a = Integer.parseInt(m);
        int b = a*a;
        String c = String.valueOf(b);
        JavaApplication22.tf2.setText(c);
    }
}