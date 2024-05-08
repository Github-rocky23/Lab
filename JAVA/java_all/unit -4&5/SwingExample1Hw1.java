//enabling and disabing textfield
import java.awt.*;
import java.awt.event.*;
class SwingExample1Hw1 implements ActionListener
{
	Frame f;
	Button b1;
	TextField t1,t2;
	SwingExample1Hw1()
	{
		f=new Frame();
		t1=new TextField();
		t2=new TextField();
		t1.setBounds(50,100,150,20);
		t2.setBounds(50,150,150,20);
		b1=new Button("button");
		b1.setBounds(200,150,100,50);
		b1.addActionListener(this);
		t1.addFocusListener(
					new FocusAdapter()
					{
						public void focusGained(FocusEvent e)
						{
							t1.setBackground(Color.RED);
							t1.setForeground(Color.YELLOW);
							b1.setEnabled(true);
						}
						public void focusLost(FocusEvent e)
						{
							t1.setBackground(Color.BLUE);
							b1.setEnabled(false);
						}
						
					}
					);
		f.add(t1);
		f.add(b1);
		f.add(t2);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		t1.getText();
		t2.getText();
	}
	public static void main(String main[])
	{
		 new SwingExample1Hw1();
	}

	
}