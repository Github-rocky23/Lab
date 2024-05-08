interface I1
{
	void a();
}
interface I2 extends I1
{
	void b();
}
interface I3 extends I2
{
	void c();
}
abstract class ac implements I3
{
	public void c()
	{
		System.out.println("ac");
	}
}
class Child extends ac
{
		public void a()
		{
			System.out.println("a");
		}
		public void b()
		{
			System.out.println("b");
		}
}
class InterfaceExample
{
	public static void main(String args[])
	{
		Child c1=new Child();
		c1.a();
		c1.b();
		c1.c();
	}
}