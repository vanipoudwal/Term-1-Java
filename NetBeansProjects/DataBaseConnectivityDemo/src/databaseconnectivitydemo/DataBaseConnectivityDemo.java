
package databaseconnectivitydemo;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.JOptionPane;

public class DataBaseConnectivityDemo 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel l1 = new JLabel();
        JTextField tf1 = new JTextField();
        JLabel l2 = new JLabel();
        JTextField tf2 = new JTextField();
        JLabel l3 = new JLabel();
        JTextField tf3 = new JTextField();
        
        String Mobile = tf1.getText();
        if(Mobile.isEmpty())
        {
        tf2.setText("");
        tf3.setText("");
        JOptionPane.showMessageDialog(this,"Enter the Mobile No.");
        }
        else
        {
            try
            {
                Class.forName("java.sql.DriverManger");
                Connection con = (Connection)
                DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","root");
                Statement stmt = (Statement) con.createStatement();
                String query = "SELECT NAME, EMAIL FROM XYZ WHERE MOBILE ='"+Mobile+"';";
                ResultSet rs = stmt.executeQuery(query);
                if(rs.next())
                {
                    String Name = rs.getString("Name");
                    String Email = rs.getString("Email");
                    tf1.setText(Name);
                    tf3.setText(Email);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Sorry! No such Mobile No.");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
        }
        f.setVisible(true);
    }
}
