//Throwing predefined Exception

class ThrowEx
{
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String args[])
	{
		try
		{
			//validate(13);
			validate(20);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code");
	}
}
	