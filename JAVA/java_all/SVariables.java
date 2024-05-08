class Student 
{
    int rno;
    String name; 
    float cgpa;
    static String cn = "SVEC";
    Student(int rno, String name, float cgpa) 
    {
        this.rno = rno;
        this.name = name; 
        this.cgpa = cgpa; 
    }

    void display() 
    {
        System.out.println("Roll no is: " + rno); 
        System.out.println("Name is: " + name); 
        System.out.println("CGPA is: " + cgpa); 
    }
}
class SVariables 
{
	public static void main(String args[]) 
	{
        	Student s1 = new Student(1, "abc", 8.94f); 
        	Student s2 = new Student(2, "xyz", 9.0f); 
		System.out.println("Student 1 Details :-");
        	s1.display();
        	System.out.println(""); 
		System.out.println("Student 2 Details :-");
        	s2.display();         
        }
}
	