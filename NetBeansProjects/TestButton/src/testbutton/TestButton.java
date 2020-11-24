
package testbutton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestButton
{
    private final JFrame f;
    private final JPanel p;
    private final JButton b;

    public TestButton()
    {
        p = new JPanel();
        f = new JFrame("Test");
        b = new JButton("Press me!");
        b.setActionCommand("Button Pressed");
    }

    public void launchFrame()
    {
        f.add(p);
        b.addActionListener(new ButtonHandler());
        f.setLayout(new FlowLayout());
        f.add(b);
        f.pack();
        f.setVisible(true);
    }
        
    public static void main(String[] args) 
    {
        TestButton guiApp = new TestButton();
        guiApp.launchFrame();
    }

    private static class ButtonHandler implements ActionListener
    {
        public ButtonHandler()
        {
        }

    @Override
        public void actionPerformed(ActionEvent e)
        {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
