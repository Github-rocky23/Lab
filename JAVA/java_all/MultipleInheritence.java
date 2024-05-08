class A
{
	void display()
	{
		System.out.println(A);
	}
}
class B
{
	void display()
	{
		System.out.println(B);
	}
}
class c extends A,B
{
	void show()
	{
		System.out.println(C);
	}
}
class MultipleInheritence
{
	public static void main(String args[])
	{
		C c1=new C();
		c1.display();
		c1.show();
	}
}