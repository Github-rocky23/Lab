class Sample1
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				try
				{
					int a[] = {1,2};
					System.out.println(a[2]);
				}
				catch(ArithmeticException e)
				{
					System.out.println("ArithmeticException");
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException ");
			}
		}
		catch(Exception e)
		{
			System.out.println("Outer Error" );
		}
	}
}