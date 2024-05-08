import java.awt.*;
import java.awt.event.*;
class AEvent4 extends WindowAdapter implements MouseListener
{
	Frame f;
	AEvent4()
	{
		f= new Frame();
		f.addMouseListener(this);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public void mouseClicked(MouseEvent a)
	{
		System.out.println("mouse clicked");
	}
	public void mouseEntered(MouseEvent a)
	{
		System.out.println("mouse Entered");
	}
	public void mouseExited(MouseEvent a)
	{
		System.out.println("mouse Exited");
	}
	public void mousePressed(MouseEvent a)
	{
		System.out.println("mouse pressed");
	}
	public void mouseReleased(MouseEvent a)
	{
		System.out.println("mouse Released");
	}	
	public static void main(String args[])
	{
		new AEvent4();
	}
}