
package mousedrag;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDrag implements MouseMotionListener
{
    private final JFrame f;
    private final JPanel p;
    private final JTextField tf;

    public MouseDrag()
	{
            p = new JPanel();
            f = new JFrame("Mouse drag example");
            tf = new JTextField(30);
	}

    public void launchFrame()
	{
            f.add(p);
            JLabel label = new JLabel("Click and drag the mouse");
            //Add components to the frame
            f.add(tf, BorderLayout.NORTH);
            f.add(tf, BorderLayout.SOUTH);
            //Add this object as a listener
            f.addMouseMotionListener(this);
            //Size the frame and make it visible
            f.setSize(300,200);
            f.setVisible(true);
	}
        
    //These are MouseMotionListener events
    @Override
    public void mouseDragged(MouseEvent e)
	{
            String s = "Mouse dragging: X = " +e.getX() + " Y = " + e.getY();
            tf.setText(s);
	}

    //Unused MouseMotionListener method.
    //All methods of a listener must be present in the class even if they are not used.
    @Override
    public void mouseMoved(MouseEvent e)
	{
	}
        
    public static void main(String[] args)
        {
            MouseDrag mg = new MouseDrag();
            mg.launchFrame();
        }
}
