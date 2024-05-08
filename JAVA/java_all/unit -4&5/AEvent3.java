import java.awt.*;
import java.awt.event.*;
class AEvent3 extends WindowAdapter implements KeyListener
{
	Frame f;
	AEvent3()
	{
		f= new Frame();
		f.addKeyListener(this);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public void keyPressed(KeyEvent a)
	{
		System.out.println("Key pressed");
	}
	public void keyReleased(KeyEvent a)
	{
		System.out.println("Key Released");
	}
		
	public void keyTyped(KeyEvent a)
	{
		System.out.println("Key Typed");
	}	
	public static void main(String args[])
	{
		new AEvent3();
	}
}