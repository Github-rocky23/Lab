class A
{
	int i;
	String s;
	void read(int x)
	{
		i=x;
		System.out.println("The value of i is : "+i);
	}
	void read(String y)
	{
		s=y;
		System.out.println("The value of s is : "+s);
	}
	void read(int x,String y)
	{
		i=x;
		s=y;
		System.out.println(i+" "+s);
	}
}
class MethodOverload
{
	public static void main(String args[])
	{
		A A1=new A();
		A1.read(2);
		A1.read("abc");
		A1.read(1,"xyz");
	}
}
