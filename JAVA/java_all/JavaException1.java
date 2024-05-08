class JavaException1
{
	public static void main(String args[])
	{
		try
		{
			int a=12/0;
		}
		catch(ArithmeticException e)
		{
			//System.out.println("Arithmetic Exception raised");
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}