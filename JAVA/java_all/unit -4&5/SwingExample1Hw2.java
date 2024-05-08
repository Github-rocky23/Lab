import java.awt.*;  
import java.awt.event.*;  
public class SwingExample1Hw2 implements ActionListener
{  
	Frame f;
	Label l1,l2,l3,l4;  
	TextArea t;  
	Button b;  
	SwingExample1Hw2()
	 {  
    		f= new Frame();  
    		l1=new 	Label();  
    		l1.setBounds(50,25,100,30);  
    		l2=new Label();  
    		l2.setBounds(160,25,100,30);  
		l3=new Label();  
    		l3.setBounds(280,25,200,30);
		l4=new Label();  
    		l4.setBounds(540,25,100,30);
    		t=new TextArea();  
    		t.setBounds(20,75,250,200);  
    		b=new Button("5");  
    		b.setBounds(100,300,120,30);  
    		b.addActionListener(this);  
    		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(t);
		f.add(b);  
    		f.setSize(450,450);  
    		f.setLayout(null);  
    		f.setVisible(true);  
	 }  
public void actionPerformed(ActionEvent e)
{  
    String s=t.getText();  
    int v=0;
    int co=0;
    int d=0;
    int sp=0;
	
    for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u')
				v++;
		else if(c>=48 && c<=57)
				d++;
		else if(c>=32&&c<=47 || c>=58 &&c<=64 ||c>=91 && c<=96 || c>=123 && c<=126)
				sp++;
		else
			co++;
	}

		    l1.setText("vowel: "+v);  
   		    l2.setText("Consonents: "+co); 
		    l3.setText("specialchars : "+sp);  
   		    l4.setText("digits : "+d); 
		   
		    
}  
public static void main(String[] args) 
{  
    new SwingExample1Hw2();  
}  
}