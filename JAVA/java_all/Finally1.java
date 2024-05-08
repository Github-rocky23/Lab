class Finally1
{
	public static void main(String args[])
	{
		try
		{
			int data=25/5;
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println("Exception raised");
		}
		finally
		{
			System.out.println("finally block is always executed");
		}	
		System.out.println("Rest of the code");
	}
}