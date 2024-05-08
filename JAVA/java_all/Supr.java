class A
{
	A()
	{
		System.out.println("parent class default constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("child class default constructor");
	}
}
class Supr
{
	public static void main(String args[])
	{
		B b1=new B();
	}
}
	