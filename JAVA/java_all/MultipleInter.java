Interface I1
{
	void show();
}
Interface I2
{
	void show();
}
class c1 implements I1,I2
{
	public void show()
	{
		System.out.println("Multiple Inheritence");
	}
}
class MultipleInter
{
	public static void main(String args[])
	{
		 c1 obj = new c1();
	         obj.show();
	}
}
