//Invoking Default constructor of parent class constructor in a child class parameterised constructor
class A
{
	A()
	{
		System.out.println("parent class");
	}
}
class B extends A
{
	int i;
	B(int i)
	{
		super();
		System.out.println("child class constructor");
		this.i=i;
	}
	void display()
	{
		System.out.println(i);
	}
}
class SuprEx1
{
	public static void main(String args[])
	{
		B b=new B(10);
		b.display();
	}
}