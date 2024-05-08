class NestedTry2
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				int a=5/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic Exception raised");
			}
			try
			{
				int a[]=new int[5];
				System.out.println(a[10]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("out of range");
			}
			catch(NullPointerException e)
			{
				System.out.println("Null pointer Exception raised");
			}
		}
		catch(Exception e)
		{
			System.out.println("parent exception raised");
		}
		System.out.println("Rest of the code");
	}
}


