class Student
{
	int rno;
	String name;
	float cgpa;
	static String clg="SVEC";
	Student(int rno,String name,float cgpa)
	{
		this.rno=rno;
		this.name=name;
		this.cgpa=cgpa;
	}
	void display()
	{
		System.out.println(rno);
		System.out.println(name);
		System.out.println(cgpa);
		System.out.println(clg);
	}
}
class MainClass
{
	public static void main(String args[])
	{
		Student s1=new Student(1,"abc",9.0f);
		Student s2=new Student(2,"abcd",9.5f);
		s1.display();
		s2.display();
	}
}
