//clicking click with object creation and constructor
import javax.swing.*;
class SwingEx extends JFrame
{
	SwingEx()
	{
		JFrame j1=new JFrame();
		JButton b=new JButton("click");
		b.setBounds(130,100,100,40);
		j1.add(b);
		j1.setSize(400,500);
		j1.setVisible(true);
	}
}
class SwingExampleOne
{
	public static void main(String args[])
	{
		SwingEx s=new SwingEx();
	
	}
}