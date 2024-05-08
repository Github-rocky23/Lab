class ThrowException
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				int a=5/0;
			}
			catch(NullPointerException e)
			{
				System.out.println("Exception not handled");
			}
			finally
			{
				try
				{
					int a[]=new int[5];
					System.out.println(a[6]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("2nd try block handled");
				}
			}
		}	
		catch(Exception e)
		{
			System.out.println("order catch");
		}
		System.out.println("Rest of the code");
	}
}