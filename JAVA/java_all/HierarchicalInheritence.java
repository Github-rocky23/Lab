
class A
{
	void display1()
	{
		System.out.println("parent class");
	}
}
class B extends A
{
	void display2()
	{
		System.out.println("child1");
	}
}
class C extends A
{
	void display3()
	{
		System.out.println("Child2");
	}
}
class HierarchicalInheritence
{
	public static void main(String args[])
	{
		B b=new B();
		C c=new C();
		b.display1();
		b.display2();
		c.display1();
		c.display3();
	}
}
		
