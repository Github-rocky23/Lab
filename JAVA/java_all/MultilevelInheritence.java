class A
{
	void display1()
	{
		System.out.println("Grand parent");
	}
}
class B extends A
{
	void display2()
	{
		System.out.println("Parent class");
	}
}
class C extends B
{
	void display3()
	{
		System.out.println("Child class");
	}
}
class MultilevelInheritence
{
	public static void main(String args[])
	{
		C c1=new C();
		c1.display1();
		c1.display2();
		c1.display3();
	}
}
		
