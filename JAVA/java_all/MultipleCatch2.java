class MultipleCatch2
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[10]=5/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of range");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception raised");
		}
		catch(Exception e)
		{
			System.out.println("parent exception raised");
		}
		System.out.println("Rest of the code");
	}
}