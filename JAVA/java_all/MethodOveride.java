class A
{
	void display()
	{
		System.out.println("parent class");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("child class");
	}
}
class MethodOveride
{
	public static void main(String args[])
	{
	+	B b1=new B();
		b1.display();
	}
}