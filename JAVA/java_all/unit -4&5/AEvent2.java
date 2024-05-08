import java.awt.*;
import java.awt.event.*;
class AEvent2 extends WindowAdapter implements FocusListener
{
	Frame f;
	AEvent2()
	{
		f= new Frame();
		f.addFocusListener(this);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public void focusGained(FocusEvent a)
	{
		System.out.println("Focus gained");
	}
	public void focusLost(FocusEvent a)
	{
		System.out.println("Focus lost");
	}
		
	public void windowClosing(WindowEvent a)
	{
		f.dispose();
	}	
	public static void main(String args[])
	{
		new AEvent2();
	}
}