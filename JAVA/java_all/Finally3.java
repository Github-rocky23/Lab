class Finally3
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Inside the block");
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic Exception raised");
		}
		finally
		{
			System.out.println("finally block is always executed");
		}	
		System.out.println("Rest of the code");
	}
}