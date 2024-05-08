import javax.swing.*;
import java.awt.event.*;
class AEvent1 implements ActionListener,WindowListener
{
	JFrame f;
	JButton b;
	JTextField t1;
	AEvent1()
	{
		f= new JFrame();
		b = new JButton("click");
		t1=new JTextField();
		b.setBounds(130,200,100,40);
		t1.setBounds(130,150,100,40);
		b.addActionListener(this);
		f.addWindowListener(this);
		f.add(t1);
		f.add(b);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent a)
	{
		t1.setText("Welcome");
	}
	public void windowActivated(WindowEvent a){}
	public void windowClosed(WindowEvent a){}
	public void windowClosing(WindowEvent a){System.exit(0);}
	public void windowDeactivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowOpened(WindowEvent we){}	
	public static void main(String args[])
	{
		new AEvent1();
	}
}