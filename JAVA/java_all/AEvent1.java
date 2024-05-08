import java.awt.*;
import java.awt.event.*;
class AEvent1 implements ActionListener,WindowListener
{
	Frame f;
	Button b;
	TextField t1;
	AEvent1()
	{
		f= new Frame();
		f.setSize(400,500);
		b = new Button("click");
		b.setBounds(130,200,100,40);
		f.add(b);
		t1=new TextField();
		t1.setBounds(130,150,100,40);
		f.add(t1);
		b.addActionListener(this);
		f.addWindowListener(this);
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