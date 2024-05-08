class Sample
{
	public static void main(String args[])
	{
		try
		{
			int a=25/5;	
		}
		catch (Exception e)
		{
			System .out.println("Error");
		}
		finally
		{
			System.out.println("Always Executed");
		}
		System.out.println("Rest of the code...." );
	}
}
