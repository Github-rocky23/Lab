import java.util.*;
class Student
{
	//Instance Variables
	int rno;
	String name;
	float cgpa;
	static String cn="SVEC";
	void  read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Roll no : ");
		rno=sc.nextInt();
		System.out.print("Enter Student Name : ");
		name=sc.next();
		System.out.print("Enter Student cgpa : ");
		cgpa=sc.nextFloat();	
	}
	void disp()
	{

		System.out.println(" ");
		System.out.println("Displaying Student details : ");
		System.out.println("Roll no of the student is : "+" "+rno);
		System.out.println("Name of the student is : "+" "+name);
		System.out.println("cgpa of the student is : "+" "+cgpa);
		System.out.println("college name of the student is : "+" "+cn);
	}
	void disp(int rno)
	{
		System.out.println(" ");
		System.out.println("Displaying the details of the student with specified roll no : ");
		System.out.println("Name of the student is : "+" "+name);
		System.out.println("cgpa of the student is : "+" "+cgpa);
		System.out.println("college name of the student is : "+" "+cn);
	}
	void disp(String name)
	{
		
		System.out.println(" ");
		System.out.println("Displaying the details of the student with specified name : ");
		System.out.println("Roll of the student is : "+" "+rno);
		System.out.println("cgpa of the student is : "+" "+cgpa);
		System.out.println("college name of the student is : "+" "+cn);
	}
}
class ArrOfObjects
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of students : ");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
		}
		for(int i=0;i<n;i++)
		{
			s[i].read();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Student"+(i+1)+"details are:");
			s[i].disp();
		}
		System.out.println(" ");
		System.out.println("Enter the roll number of the student : ");
		int id=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(s[i].rno==id)
			{
				s[i].disp(id);
				break;
			}
		}
		System.out.println(" ");
		System.out.println("Enter the name of the student : ");
		String stdname=sc.next();
		for(int i=0;i<n;i++)
		{
			if(s[i].name.equals(stdname))
			{
				s[i].disp(stdname);
				break;
			}
		}
		
	}
}