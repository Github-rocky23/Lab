class UserDefinedException extends Exception
{
	public UserDefinedException(String str)
	{
		super(str);
	}
}
class TestThrow
{
	public static void main(String args[])
	{
		try
		{
			throw new UserDefinedException("this is a UserDefinedException");
		}
		catch(UserDefinedException ude)
		{
			System.out.println("caugtht the exception");
			System.out.println(ude.getMessage());
		}
	}
}