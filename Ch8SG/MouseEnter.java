import java.awt.*;
import java.awt.event.*;

public Class MouseEnter implements MouseListener
{
private Frame f;
private TextField tf;

	public MouseEnter()
	{
		f = new Frame("Mouse enter example");
		tf = new TextField(30);
	}

	public void launchFrame()
	{
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

	public void mouseEntered(MouseEvent e)
	{
		String s = "The source entered";
		tf.setText(s);
	}

	public void mouseExited(MouseEvent e)
	{
		String s = "The source has left the building";
		tf.setText(s);
	}

	//All methods of a listener must be present in the class even if they are not used.
	//Unused MouseListener methods.
	public void mousePressed(MouseEvent e)
	{
	}

	public void mouseClicked(MouseEvent e)
	{
	}

	public void mouseReleased(MouseEvent e)
	{
	}

	public static void main(String args[])
	{
		MouseEnter me = new MouseEnter();
		me.launchFrame();
	}
}