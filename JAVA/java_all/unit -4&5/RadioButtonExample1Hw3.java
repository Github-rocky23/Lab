import javax.swing.*;    
import java.awt.event.*;    
class RadioButtonExample1Hw3 extends JFrame implements ActionListener
{    
	JRadioButton rb1,rb2,rb3;    
	JButton b;    
	RadioButtonExample1Hw3()
	{      
		rb1=new JRadioButton("B.Tech");    
		rb1.setBounds(100,50,100,30);      
		rb2=new JRadioButton("M.Tech");    
		rb2.setBounds(100,100,100,30);
		rb3=new JRadioButton("ph-d");    
		rb3.setBounds(100,150,100,30);     
		ButtonGroup bg=new ButtonGroup();    
		bg.add(rb1);
		bg.add(rb2); 
		bg.add(rb3);   
		b=new JButton("click");    
		b.setBounds(100,250,80,30);    
		b.addActionListener(this);    
		add(rb1);
		add(rb2);
		add(rb3);
		add(b);    
		setSize(300,300);    
		setLayout(null);    
		setVisible(true);    
	}   
	public void actionPerformed(ActionEvent e)
	{    
		if(rb1.isSelected())
		{    
			JOptionPane.showMessageDialog(this,"You are selected B.Tech");    
		}    
		if(rb2.isSelected())
		{    
			JOptionPane.showMessageDialog(this,"You are selected M.Tech");    

		}
		if(rb3.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You are selected Ph-d");
		}
		    
	}    
	public static void main(String args[])
	{    
		new RadioButtonExample1Hw3();    
	}
}