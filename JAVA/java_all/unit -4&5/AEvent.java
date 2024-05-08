import javax.swing.*;
import java.awt.event.*;
class AEvent extends JFrame implements ActionListener
 {
	JFrame f1;
	JButton b;
	JTextField t1;
	AEvent()
	{
		f1=new JFrame();
		b=new JButton("click");
		t1=new JTextField();
		b.setBounds(130,200,100,40);	//x,y axis, width and height
		t1.setBounds(130,150,100,40);
		b.addActionListener(this);
		f1.add(b);
		f1.add(t1);
		f1.setSize(300,400);	//width and height
		f1.setLayout(null);
		f1.setVisible(true);	//default=false
	}
	public void actionPerformed(ActionEvent e)
	{
		t1.setText("Welcome");
	}
	public static void main(String args[])	
	{
		new AEvent();
	}

}