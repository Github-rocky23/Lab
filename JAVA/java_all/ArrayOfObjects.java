import java.util.*;
class Student
{
	//Instance variables
	int rno;
	String name;
	float cgpa;
	static String cn="SVEC";
	//Instance method
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll no : ");
		rno=sc.nextInt();
		System.out.print("Enter name : ");
		name=sc.next();
		System.out.print("Enter cgpa : ");
		cgpa=sc.nextFloat();
	}
	void display()
	{
		System.out.println("student roll no is : "+rno);
		System.out.println("student name is : "+name);
		System.out.println("student cgpa is : "+cgpa);
	}
}
class ArrayOfObjects
{
	public static void main(String args[])
	{
		
		Student S[]= new Student [50]; 
		for (int i=0; i<2; i++)
		{
			S[i]=new Student();
		}
		for (int i=0;i<2;i++) 
		{
			S[i].read(); 
		}
		for(int i=0;i<2;i++)
		{
			S[i].display();
		}
	}
}
