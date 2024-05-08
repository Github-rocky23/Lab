class A
{
	int i=10;
	void display()
	{
		System.out.println("parent class"+" "+i);
	}
}
class B extends A
{
	int i=20;
	void display()
	{
		super.display();
		System.out.println("child class"+" "+i);
	}
}
class SuprInstVarMethd
{
	public static void main(String args[])
	{
		B B1=new B();
		B1.display();
	}
}