import javax.swing.*;
class SwingExample3 extends JFrame
{
	JFrame f;
	SwingExample3()
	{
		f=new JFrame();
		JButton b=new JButton("click");
		b.setBounds(130,100,100,40);	//x,y axis, width and height
		f.add(b);
		f.setSize(400,500);	//width and height
		f.setLayout(null);
		f.setVisible(true);	//default=false
	}
}
class SwingMain2
{
	public static void main(String args[])	
	{
		SwingExample2 s=new SwingExample2();
	}
}