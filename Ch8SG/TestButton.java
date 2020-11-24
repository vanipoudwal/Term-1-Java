import java.awt.*;
import java.awt.event.*;

public class TestButton
{
private Frame f;
private Button b;

	public TestButton()
	{
		f = new Frame("Test");
		b = new Button("Press me!");
		b.setActionCommand("Button Pressed");
	}

	public void launchFrame()
	{
		b.addActionListener(new ButtonHandler());
		f.setLayout(new FlowLayout());
		f.add(b);
		f.pack();
		f.setVisible(true);
	}

public static void main(String args[])
	{
		TestButton guiApp = new TestButton();
		guiApp.launchFrame();
	}
}