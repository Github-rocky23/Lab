class A
{
	void display()
	{
		System.out.println("super class");
	}
}
class  B extends A
{
	void show()
	{
		System.out.println("sub class");
	}
}
class SingleInheritence
{
	public static void main(String args[])
	{
		B b1=new B();
		
		//A A1=new B();
		//we can asssign a child class object to parent class reference vice versa is not possible
		
		b1.display();
		b1.show();
	}
}