import javax.swing.*;  
import java.awt.event.*;    
public class CheckBoxExample1Hw4    
{    
	JFrame f;
	JCheckBox c1,c2,c3;
	JLabel l1,l2,l3;
    	CheckBoxExample1Hw4()
	{    
        f= new JFrame("CheckBox Example");    
        l1= new JLabel(); 
	l2=new JLabel();
	l3=new JLabel();           
        l1.setHorizontalAlignment(JLabel.CENTER);
	l2.setHorizontalAlignment(JLabel.CENTER);
	l3.setHorizontalAlignment(JLabel.CENTER);    
        l1.setSize(400,100);
	l2.setSize(500,200);
	l3.setSize(600,300);    
        c1 = new JCheckBox("C++");    
        c1.setBounds(150,100, 50,50);    
        c2 = new JCheckBox("Java");    
        c2.setBounds(150,150, 50,50);
	c3=new JCheckBox("python");
	c3.setBounds(150,200,50,50);    
        f.add(c1); f.add(c2);f.add(c3); f.add(l1);f.add(l2);f.add(l3);    
        c1.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                l1.setText("C++ Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });    
        c2.addItemListener(new ItemListener() {    
             public void itemStateChanged(ItemEvent e) {                 
                l2.setText("Java Checkbox: "     
                + (e.getStateChange()==1?"checked":"unchecked"));    
             }    
          });
	 c3.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent e){
		l3.setText("python checkbox: "
		+(e.getStateChange()==1?"checked":"unchecked"));
		}
	});  
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
     }    
public static void main(String args[])    
{    
    new CheckBoxExample1Hw4();    
}    
}