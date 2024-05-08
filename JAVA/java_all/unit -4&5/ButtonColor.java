import java.awt.*;
import java.awt.event.*;
class ButtonColor extends WindowAdapter implements FocusListener
{
	Frame f;
	ButtonColor()
	{
		f= new Frame();
		f.addFocusListener(this);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public void focusGained(FocusEvent a)
	{
		System.out.println("Focus Gained");
		f.setBackground(Color.GREEN);
	}
	public void focusLost(FocusEvent a)
	{
		System.out.println("Focus lost");
		f.setBackground(Color.RED);
	}
	public void windowClosing(WindowEvent w)
        {	//System.exit(0)
		f.dispose();
	}
	public static void main(String args[])
	{
		new ButtonColor`();
	}
}