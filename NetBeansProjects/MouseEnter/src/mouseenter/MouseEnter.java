
package mouseenter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEnter implements MouseListener
{
    private final JFrame f;
    private final JPanel p;
    private final JTextField tf;

    public MouseEnter()
    {
        p = new JPanel();
	f = new JFrame("Mouse enter example");
    	tf = new JTextField(30);
    }

    public void launchFrame()
    {
        f.add(p);
	Label label = new Label("Mouse entered and exited demo");
	//Add components to the frame
	f.add(label, BorderLayout.NORTH);
	f.add(tf, BorderLayout.SOUTH);
	//Add this object as a listener
	f.addMouseListener(this);
	//Size the frame and make it visible
        f.setSize(3000,200);
	f.setVisible(true);
    }
    
    @Override
    public void mouseEntered(MouseEvent e)
    {
	String s = "The source entered";
	tf.setText(s);
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
	String s = "The source has left the building";
	tf.setText(s);
    }

    //All methods of a listener must be present in the class even if they are not used.
    //Unused MouseListener methods.
    @Override
    public void mousePressed(MouseEvent e)
    {
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
    }
    
    public static void main(String[] args)
    {
        MouseEnter me = new MouseEnter();
	me.launchFrame();
    }
}
