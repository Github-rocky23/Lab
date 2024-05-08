interface I1
{
	void show();
}
interface I2
{
	void show();
}
class C1 implements I1,I2
{
	public void show()
	{
		System.out.println("multiple inheritence");
	}
}
class MultipleInterface1
{
	public static void main(String args[])
	{	
		new C1().show();
	}
}