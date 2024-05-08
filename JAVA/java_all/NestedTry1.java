class NestedTry1
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				try
				{
					int a[]=new int[5];
					System.out.println(a[10]);
				}
				catch(ArithmeticException e)
				{
					System.out.println("Arithmetic Exception raised");
				}
			}
			catch(NullPointerException e)
			{
				System.out.println("Null pointer Exception raised");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception raised");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("out of range");
		}
		catch(Exception e)
		{
			System.out.println("parent exception raised");
		}
		System.out.println("Rest of the code");
	}
}


