import java.awt.*;
import java.awt.event.*;
class SwingCalciColorOne implements ActionListener
{
	Frame f;
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	TextField t1;
	TextField t2;
	TextField t3;
	SwingCalciColorOne()
	{
		f=new Frame();
		t1=new TextField();
		t2=new TextField();
		t3=new TextField();
		t1.setBounds(50,50,150,20);
		t2.setBounds(50,100,150,20);
		t3.setBounds(50,150,150,20);
		b1=new Button("add");
		b2=new Button("subtract");
		b3=new Button("multiplication");
		b4=new Button("division");
		b1.setBounds(50,200,50,50);
		b2.setBounds(100,200,80,30);
		b3.setBounds(120,200,120,50);
		b4.setBounds(140,120,80,30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		t1.addFocusListener(
					new FocusAdapter()
					{
						public void focusGained(FocusEvent e)
						{
							t1.setBackground(Color.RED);
							t1.setForeground(Color.YELLOW);
						}
						public void focusLost(FocusEvent e)
						{
							t1.setBackground(Color.BLUE);
						}
						
					}
					);
		t2.addFocusListener(
					new FocusAdapter()
					{
						public void focusGained(FocusEvent e)
						{
							t2.setBackground(Color.YELLOW);
							t2.setForeground(Color.RED);

						}
						public void focusLost(FocusEvent e)
						{
							t2.setBackground(Color.GREEN);
						}
						

					}
					);
		t3.addFocusListener(
					new FocusAdapter()
					{
						public void focusGained(FocusEvent e)
						{
							t3.setBackground(Color.GREEN);
							t3.setForeground(Color.YELLOW);

						}
						public void focusLost(FocusEvent e)
						{
							t3.setBackground(Color.BLACK);
						}
						

					}
					);



		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setSize(400,500);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=0;
		if(e.getActionCommand()=="add")
			c=a+b;
		else if(e.getActionCommand()=="subtract")
			c=a-b;
		else if(e.getActionCommand()=="multiplication")
			c=a*b;
		else if(e.getActionCommand()=="division")
			c=a/b;
		  String res=String.valueOf(c);  
    			t3.setText(res);  
	}
	public static void main(String main[])
	{
		 new SwingCalciColorOne();
	}

	
}