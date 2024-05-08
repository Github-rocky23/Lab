class Finally2
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Inside the block");
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer Exception raised");
		}
		finally
		{
			System.out.println("finally block is always executed");
		}	
		System.out.println("Rest of the code");
	}
}