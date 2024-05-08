import javax.swing.*;
class SwingExample3 extends JFrame
{
	JFrame f1;
	JButton b;
	JTextField t1;
	SwingExample3()
	{
		f1=new JFrame();
		b=new JButton("click");
		t1=new JTextField();
		b.setBounds(130,200,100,40);	//x,y axis, width and height
		t1.setBounds(130,150,100,40);
		f1.add(b);
		f1.add(t1);
		f1.setSize(300,400);	//width and height
		f1.setLayout(null);
		f1.setVisible(true);	//default=false
	}
}
class SwingEx1
{
	public static void main(String args[])	
	{
		SwingExample3 s=new SwingExample3();
	}
}