import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDrag implements MouseMotionListener
{
private Frame f;
private TextField tf;

	public MouseDrag()
	{
		f = new Frame("Mouse drag example");
		tf = new TextField(30);
	}

	public void launchFrame()
	{
		Label label = new Label("Click and drag the mouse");
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
	public void mouseDragged(MouseEvent e)
	{
		String s = "Mouse dragging: X = " +e.getX() + " Y = " + e.getY();
		tf.setText(s);
	}

	//Unused MouseMotionListener method.
	//All methods of a listener must be present in the class even if they are not used.
	public void mouseMoved(MouseEvent e)
	{
	}

	public static void main(String arg[])
	{
		MouseDrag md = new MouseDrag();
		md.launchFrame();
	}
}